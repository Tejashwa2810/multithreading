package com.example.multithreading.Practice9;

import com.example.multithreading.Practice9.pojo.PersonAddress;
import com.example.multithreading.Practice9.pojo.PersonInfo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserService {

    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public CompletableFuture<User> getUserDetails() {

        CompletableFuture<PersonInfo> personalDetails =
                CompletableFuture.supplyAsync(RemoteServices::getNameAge, executor);

        CompletableFuture<PersonAddress> personalAddress =
                CompletableFuture.supplyAsync(RemoteServices::getPersonAddress, executor);

        CompletableFuture<String> lastActivity =
                CompletableFuture.supplyAsync(RemoteServices::getLastActive, executor);

        CompletableFuture<Double> personalScore =
                CompletableFuture.supplyAsync(RemoteServices::getScore, executor);

        return personalDetails
                .thenCombine(personalAddress,
                        (info, address) -> new Object[]{info, address})
                .thenCombine(lastActivity,
                        (arr, activity) -> new Object[]{arr[0], arr[1], activity})
                .thenCombine(personalScore,
                        (arr, score) -> {
                            PersonInfo info = (PersonInfo) arr[0];
                            PersonAddress address = (PersonAddress) arr[1];
                            String activity = (String) arr[2];

                            return new User(
                                    info.getName(),
                                    info.getAge(),
                                    address.getCity(),
                                    address.getCountry(),
                                    activity,
                                    score
                            );
                        });
    }

    public void shutdown() {
        executor.shutdown();
    }
}

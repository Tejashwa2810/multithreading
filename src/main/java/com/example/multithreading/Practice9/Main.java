package com.example.multithreading.Practice9;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        userService.getUserDetails()
                .thenAccept(user ->
                        System.out.println(
                                " Age: "+user.getAge()+" score: "+user.getReputationScore()+" city: "+user.getCity()+" country: "+user.getCountry()+" name: "+user.getName()
                        )
                )
                .exceptionally(ex -> {
                    System.err.println("Order failed: " + ex.getMessage());
                    return null;
                })
                .join(); // wait only at the boundary

        userService.shutdown();
    }
}

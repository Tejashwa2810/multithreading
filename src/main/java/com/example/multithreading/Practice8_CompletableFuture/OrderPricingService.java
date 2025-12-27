package com.example.multithreading.Practice8_CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderPricingService {

    private final ExecutorService executor =
            Executors.newFixedThreadPool(4);

    public CompletableFuture<OrderPrice> calculateFinalPrice() {

        CompletableFuture<Double> basePriceFuture =
                CompletableFuture.supplyAsync(
                        RemoteServices::fetchBasePrice,
                        executor
                );

        CompletableFuture<Double> discountFuture =
                CompletableFuture.supplyAsync(
                        RemoteServices::fetchDiscount,
                        executor
                ).exceptionally(ex -> 0.0); // fallback

        CompletableFuture<Double> taxFuture =
                CompletableFuture.supplyAsync(
                        RemoteServices::fetchTax,
                        executor
                );

        CompletableFuture<Double> deliveryFuture =
                CompletableFuture.supplyAsync(
                        RemoteServices::fetchDeliveryCharge,
                        executor
                );

        return basePriceFuture
                .thenCombine(discountFuture, (base, discount) -> base - discount)
                .thenCombine(taxFuture, Double::sum)
                .thenCombine(deliveryFuture, Double::sum)
                .thenApply(OrderPrice::new);
    }

    public void shutdown() {
        executor.shutdown();
    }
}

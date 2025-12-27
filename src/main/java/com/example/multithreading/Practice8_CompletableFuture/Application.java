package com.example.multithreading.Practice8_CompletableFuture;

public class Application {

    public static void main(String[] args) {

        OrderPricingService pricingService = new OrderPricingService();

        pricingService.calculateFinalPrice()
                .thenAccept(orderPrice ->
                        System.out.println(
                                "Final Order Price = " + orderPrice.getTotalPrice()
                        )
                )
                .exceptionally(ex -> {
                    System.err.println("Order failed: " + ex.getMessage());
                    return null;
                })
                .join(); // wait only at the boundary

        pricingService.shutdown();
    }
}

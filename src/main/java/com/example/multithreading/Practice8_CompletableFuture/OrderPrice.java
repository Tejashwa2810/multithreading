package com.example.multithreading.Practice8_CompletableFuture;

public class OrderPrice {
    private final double totalPrice;

    public OrderPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

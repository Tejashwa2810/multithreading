package com.example.multithreading.Practice8_CompletableFuture;

import java.util.Random;

public class RemoteServices {

    private static final Random random = new Random();

    public static double fetchBasePrice() {
        sleep(800);
        return 1000;
    }

    public static double fetchDiscount() {
        sleep(700);
        if (random.nextBoolean()) {
            throw new RuntimeException("Discount service failed");
        }
        return 150;
    }

    public static double fetchTax() {
        sleep(600);
        return 180;
    }

    public static double fetchDeliveryCharge() {
        sleep(500);
        return 50;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

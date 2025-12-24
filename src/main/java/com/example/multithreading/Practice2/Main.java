package com.example.multithreading.Practice2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Flag flag = new Flag();
        final int[] count = {0};

        Thread worker = new Thread(()->{
            while(flag.isRunning()){
                System.out.println("Thread is running " + count[0] + " Times");
                count[0]++;
            }
        });

        worker.start();

        Thread.sleep(1000);
        flag.stop();
        System.out.println("Total " + count[0]);
    }
}

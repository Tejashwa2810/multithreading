package com.example.multithreading.Practice3;

import com.example.multithreading.Practice2.Flag;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Flag flag = new Flag();
        final int[] count = {0};

        Thread worker = new Thread(()->{
            while(flag.running){
                System.out.println("Thread is running " + count[0] + " Times");
                count[0]++;
            }
        });

        worker.start();

        Thread.sleep(100);
        flag.running = false;
        System.out.println("Total " + count[0]);
    }
}

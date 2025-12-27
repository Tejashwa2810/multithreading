package com.example.multithreading.Practice7_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0; i<100; i++){
            int taskId = i;
            executor.execute(()->{
                System.out.println("Running task " + taskId + " using " + Thread.currentThread().getName());
            });
        }
    }
}

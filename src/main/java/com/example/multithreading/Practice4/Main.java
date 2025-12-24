package com.example.multithreading.Practice4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter ac = new AtomicCounter();

        Thread t1 = new Thread(()->{
            for(int i=0; i<100000; i++){
                ac.counter.incrementAndGet();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<100000; i++){
                ac.counter.incrementAndGet();
            }
        });

//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        AtomicString as = new AtomicString();

        Thread t3 = new Thread(()->{
            for(int i=0; i<10; i++){
                as.str.updateAndGet(old -> old + "a");
            }
        });

        Thread t4 = new Thread(()->{
            for(int i=0; i<10; i++){
                as.str.updateAndGet(old -> old + "b");
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(as.str.get());
    }
}

package com.example.multithreading.Practice5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int count = 0;
    Lock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }
    }

    public int get(){
        return count;
    }
}

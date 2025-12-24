package com.example.multithreading.Practice1;

public class Counter {
    public int count;

    public void increment(){
        synchronized (this){
            count++;
        }
    }
}

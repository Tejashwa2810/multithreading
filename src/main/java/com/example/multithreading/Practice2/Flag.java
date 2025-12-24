package com.example.multithreading.Practice2;

public class Flag {
    public boolean running = true;

    synchronized void stop() {
        running = false;
    }

    synchronized boolean isRunning() {
        return running;
    }
}

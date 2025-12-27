package com.example.multithreading.Practice9.pojo;

public final class PersonInfo {

    private final String name;
    private final int age;

    public PersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
package com.example.multithreading.Practice9;

import java.time.LocalTime;

public class User {
    private String name;
    private int age;
    private String city;
    private String country;
    private String lastActive;
    private Double reputationScore;

    public User() {
    }

    public User(String name, int age, String city, String country, String lastActive, Double reputationScore) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.lastActive = lastActive;
        this.reputationScore = reputationScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }

    public Double getReputationScore() {
        return reputationScore;
    }

    public void setReputationScore(Double reputationScore) {
        this.reputationScore = reputationScore;
    }
}

package com.example.multithreading.Practice9.pojo;

public class PersonAddress {
    private String city;
    private String country;

    public PersonAddress() {
    }

    public PersonAddress(String city, String country) {
        this.city = city;
        this.country = country;
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
}

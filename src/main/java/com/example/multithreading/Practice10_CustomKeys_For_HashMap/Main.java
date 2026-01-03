package com.example.multithreading.Practice10_CustomKeys_For_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<User, String> map = new HashMap<>();

        User u1 = new User("Tej", 24);      // Custom Key of a hashmap
        User u2 = new User("Tej", 24);      // Custom Key of a hashmap

        map.put(u1, "Order1");

        System.out.println(map.get(u2)); // Returns "null" because even though u1 & u2
                                         // has same details but they are two different
                                         // object with 2 different addresses
    }
}

package com.example.multithreading.Practice9;

import com.example.multithreading.Practice9.pojo.PersonAddress;
import com.example.multithreading.Practice9.pojo.PersonInfo;

public class RemoteServices {

    public static PersonInfo getNameAge() {
        return new PersonInfo("Tej", 24);
    }

    public static PersonAddress getPersonAddress(){
        return new PersonAddress("Meerut", "India");
    }

    public static String getLastActive(){
        return "1 hour ago";
    }

    public static Double getScore(){
        return 70.00;
    }
}

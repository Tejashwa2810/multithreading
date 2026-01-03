package com.example.multithreading.Practice11_CustomKeys_For_HashMap_Part2;

public class Application {

    public static void main(String[] args) {

        UserProfileCache cache = new UserProfileCache();

        // user identity
        UserKey userKey1 = new UserKey(1L);

        // value to cache
        UserProfile profile = new UserProfile(
                "Tej",
                "tej@example.com"
        );

        // put into cache
        cache.put(userKey1, profile);

        // simulate a different object with same identity
        UserKey userKey2 = new UserKey(1L);

        // retrieve from cache
        UserProfile cachedProfile = cache.get(userKey2);

        System.out.println(cachedProfile);
    }
}

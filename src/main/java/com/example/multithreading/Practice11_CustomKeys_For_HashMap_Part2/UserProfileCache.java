package com.example.multithreading.Practice11_CustomKeys_For_HashMap_Part2;

import java.util.HashMap;
import java.util.Map;

public class UserProfileCache {

    private final Map<UserKey, UserProfile> cache = new HashMap<>();

    public void put(UserKey key, UserProfile profile) {
        cache.put(key, profile);
    }

    public UserProfile get(UserKey key) {
        return cache.get(key);
    }

    public boolean contains(UserKey key) {
        return cache.containsKey(key);
    }
}

package com.example.multithreading.Practice11_CustomKeys_For_HashMap_Part2;

import java.util.Objects;

public final class UserKey {

    private final Long userId;

    public UserKey(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return Objects.equals(userId, userKey.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "UserKey{" +
                "userId=" + userId +
                '}';
    }
}

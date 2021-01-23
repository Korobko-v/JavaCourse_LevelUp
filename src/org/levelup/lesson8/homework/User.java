package org.levelup.lesson8.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class User {
    String username;
    String email;
    String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {
        List<User> duplicates = new ArrayList<>();
//        for (User userA : collA) {
//            for (User userB : collB) {
//                if (userA.equals(userB) && !duplicates.contains(userA)) {
//                    duplicates.add(userA);
//                    if (!duplicates.contains(userB)) {
//                        duplicates.add(userB);
//                    }
//                }
//            }
//        }
        for (User user : collA) {
            if (collB.contains(user)) {
                duplicates.add(user);
            }
        }
        return duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password);
    }
}

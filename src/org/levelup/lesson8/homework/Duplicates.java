package org.levelup.lesson8.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Duplicates {

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

}

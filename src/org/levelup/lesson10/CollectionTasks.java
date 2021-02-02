package org.levelup.lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTasks {
    public static void main(String[] args) {
        Collection<String> products = new ArrayList<>();
        products.add("Мяч");
        products.add("Сетка");
        products.add("Футболка");
        products.add("Штаны");
        products.add("Сыр");
        products.add("Молоко");
        products.add("Мяч");

        StringPredicate predicate = value -> value.startsWith("М");
        StringPredicate p = value -> value.length() > 5;
        filterCollection(products, predicate);
        products.forEach(product -> System.out.println(product));
        System.out.println("Начинается на \"С\": ");
        products.stream()
                .filter(pr -> pr.startsWith("С"))
                .forEach(pr -> System.out.println(pr));

        List<Integer> stringLengths = products.stream()
                .map(pr -> pr.length())
                .collect(Collectors.toList());
        stringLengths.forEach(l -> System.out.println(l));

        double average = products.stream()
                .mapToInt(pr -> pr.length())
                .average()
                .getAsDouble();
        System.out.println("Средняя длина строки: " + average);

        StaticExample.value = 45;
        System.out.println(StaticExample.value);

        StringPredicate lengthPredicate = value -> value.length() > 5;
    }

    static Collection<String> filterCollection (Collection<String> originalCollection, StringPredicate predicate) {
        Collection<String> filtered = new ArrayList<>();
        for (String element : originalCollection) {
            if(predicate.check(element)) {
                filtered.add(element);
            }
        }
        return filtered;
    }

    interface StringPredicate {
        boolean check(String value);
    }
    static class startWithCertainSymbolStringPredicate implements StringPredicate {

        @Override
        public boolean check(String value) {
            return false;
        }
    }
}

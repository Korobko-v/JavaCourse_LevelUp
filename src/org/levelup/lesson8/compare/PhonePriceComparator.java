package org.levelup.lesson8.compare;

import java.util.Comparator;

public class PhonePriceComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
//        if (o1.getPrice() < o2.getPrice()) return -1;
//        else if (o1.getPrice() > o2.getPrice()) return 1;
//        else return 0;

        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

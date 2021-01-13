package org.levelup.lesson5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyFilter extends BaseFilter {
    @Override
    boolean filter(Object o) {
        Shop shop = (Shop) o;
        if (shop.getArea() > 500) {
            return true;
        }
        return false;
    }
}

package org.levelup.lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class FilterService {
    Object[] filterArray(Object[] object, BaseFilter baseFilter) {
        Shop[] shops = (Shop[]) object;
        List<Object> list = new ArrayList<>();
        for (Shop shop : shops) {
                if (baseFilter.filter(shop)) {
                    list.add(shop);
                }
            }

        Object[]newArr = new Shop[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        Shop s1 = new Shop("s1" , 500);
        Shop s2 = new Shop("s2" , 1000);
        Shop s3 = new Shop("s3" , 1200);

        Shop[] shops = new Shop[] {s1, s2, s3};
        System.out.println("Все магазины:");
        for (Shop shop: shops) {
            System.out.println(shop.getName());
        }
        BaseFilter baseFilter = new MyFilter();
        FilterService filterService = new FilterService();
        Shop[] filteredShops = (Shop[]) filterService.filterArray(shops, baseFilter);
        System.out.println("Магазины с площадью более 500 квадратных метров:");
        for (Shop shop: filteredShops) {
            System.out.println(shop.getName());
        }
    }
}

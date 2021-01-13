package org.levelup.lesson5.homework;

import java.util.Objects;

public class Shop {
    private String name;
    private String type;
    private int area;
    private boolean isOpen;



    public Shop(String name, String type, int area, boolean isOpen) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.isOpen = isOpen;
    }

    public Shop(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public static void main(String[] args) {

        Shop magnit = new Shop("Магнит", "Supermarket", 500, true);
        Shop sunlight = new Shop("Sunlight", "jewellery", 500, false);
        Shop sportmaster = new Shop("Спортмастер", "sports goods" , 1000, true);
        Shop mega = new Shop("Мега", "big box", 10000, true);
        Shop petrovich = new Shop("Петрович", "housewares" , 2000, true);
        Shop perekryostok = new Shop("Перекрёсток", "supermarket", 500, true);
        Shop kb = new Shop("Красное&Белое" , "liquor store", 500, true);

        Shop[] shops = new Shop[] {magnit, sunlight, sportmaster, mega, petrovich, perekryostok, kb};
        Shop trial = new Shop("Петрович", "housewares" , 2000, true);

        for (Shop shop : shops) {
            if (shop.equals(trial)) {
                System.out.println("Петрович на месте");
            }
            if (!shop.isOpen) {
                System.out.println("Ыыыыы, Санлайт закрылся)))000");
            }
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return area == shop.area &&
                isOpen == shop.isOpen &&
                Objects.equals(type, shop.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, area, isOpen);
    }
}

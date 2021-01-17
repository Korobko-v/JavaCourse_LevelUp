package org.levelup.lesson6.structure;

public class StructureApp {
    public static void main(String[] args) {
        Structure structure = new DynamicArray(5);
        structure.addLast(5);
        structure.addLast(2);
        structure.addLast(3);
        structure.addLast(4);
        structure.addLast(1);
        structure.addLast(75);
        structure.addLast(17);
        structure.addLast(72);
//        structure.addLast(47);
//        structure.addLast(3);
//        structure.addLast(45);
//        structure.addLast(19);
//        structure.addLast(10);
//        structure.addLast(8);
//        structure.addLast(888);
        structure.removeByValue(3);
        structure.removeByIndex(1);
        System.out.println(structure.size);
        structure.trim();
        System.out.println(structure.getByIndex(5));

    }
}

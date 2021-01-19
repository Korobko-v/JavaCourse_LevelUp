package org.levelup.lesson7;

public class GenericApp {
    public static void main(String[] args) {
        GenericObject<String> object = new GenericObject<>();
        object.setField("");

        GenericObject<Integer> integerObject = new GenericObject<>();
        integerObject.setField(25);

        GenericPair<String, Integer> pair = new GenericPair<>();
        pair.addPair("Hello" , 1);

        GenericMethod method = new GenericMethod();
        String value = method.findByIndex(0);
        int value1 = method.findByIndex(1);
    }
}

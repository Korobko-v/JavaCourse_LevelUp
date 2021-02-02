package org.levelup.lesson10;

import org.levelup.lesson10.OuterClass;

public class OuterClassApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc. new InnerClass();


        outerClass.var = 10;
        oc.var = 20;
    }
}

package org.levelup.lesson9;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(6);
        try {
            stack.push("String1");
            stack.push("String2");
            stack.push("String3");
            stack.push("String4");
            stack.push("String5");
            stack.push("String6");
        } catch (StackOverFlowException e) {
            System.out.println(e.getMessage());
        }
        String string = stack.pop();
    }
}

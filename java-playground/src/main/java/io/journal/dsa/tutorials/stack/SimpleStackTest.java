package io.journal.dsa.tutorials.stack;

public class SimpleStackTest {
    public static void main(String[] args) {

        try {
            StackArr<String> stack = new StackArr<>(3);
            stack.push("first");
            stack.push("second");
            stack.push("third");

            stack.push("fourth"); // when you add this it will print stack overflow

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop()); // when you pop this it will print stack underflow

            System.out.println(stack);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}

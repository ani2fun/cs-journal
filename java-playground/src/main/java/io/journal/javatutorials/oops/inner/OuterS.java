package io.journal.javatutorials.oops.inner;

public class OuterS {
    int x = 5;
    static int y = 10;

    static class Inner {
        void display() {
            System.out.println("static Inner class, y: " + y);
        }
    }
}

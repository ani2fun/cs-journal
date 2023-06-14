package io.journal.javatutorials.oops.inner;

public class NestedExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner outerInner = new Outer().new Inner();
        outerInner.innerDisplay();

    }
}

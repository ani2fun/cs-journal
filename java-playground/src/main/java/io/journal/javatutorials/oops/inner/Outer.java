package io.journal.javatutorials.oops.inner;

class Outer {
    int x = 10;

    class Inner {
        int y = 5;

        void innerDisplay() {
            System.out.println("Inner Display");
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("Outer Display");
    }

}

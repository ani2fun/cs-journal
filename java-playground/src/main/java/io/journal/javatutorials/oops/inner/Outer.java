package io.journal.javatutorials.oops.inner;

class Outer {
    int x = 10;

    class Inner {
        int y = 5;

        void innerDisplay() {
            System.out.println("Inner Display");
            System.out.println("x: " + x + " , y: "+y);
        }

        class InnerInner {
            void innerinnerDisplay() {
                System.out.println("Inner Inner Display");
                System.out.println("x: " + x + " , y: "+y);
            }
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("Outer Display");
    }

}

package io.journal.javatutorials.oops.inner;

public class Local {

    int x = 10;
    static int y = 5;

    void display() {
        class Inner {
            void innerDisplay() {
                System.out.println("Local Inner innerDisplay()");
                System.out.print("x: " + x + " y : " + y);
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }

}

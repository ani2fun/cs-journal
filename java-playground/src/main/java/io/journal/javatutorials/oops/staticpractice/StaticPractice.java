package io.journal.javatutorials.oops.staticpractice;

public class StaticPractice {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println("Show (non static) " + x + " , y:" + y);
    }

    static void display() {
        System.out.println("display (static) " + x);
    }


    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {

        System.out.println(StaticPractice.x);
        StaticPractice.display();

        StaticPractice.x = 40;

        StaticPractice staticPractice = new StaticPractice();

        staticPractice.show();


    }

}

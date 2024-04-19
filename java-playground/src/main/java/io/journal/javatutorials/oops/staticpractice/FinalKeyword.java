package io.journal.javatutorials.oops.staticpractice;

public class FinalKeyword {
    final int MIN = 10;
    final int MID;
    final int MAX;
    static final int NORMAL;

    // instance block
    {
        MAX = 30;
        System.out.println(MAX);
    }

    public FinalKeyword() {
        MID = 20;
        System.out.println(MID);
    }

    static {
        NORMAL = 50;
        System.out.println(NORMAL);
    }

    void Display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {

        FinalKeyword finalKeyword = new FinalKeyword();

    }

}

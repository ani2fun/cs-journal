package io.journal.javatutorials.oops.interfaces.ex1;

interface Test {
    int identifier = 10;

    void meth1();

    void meth2();

    static void meth3() {
        System.out.println("meth3 of Test static");
    }

    default void meth4() {
        System.out.println("meth4 of Test default");
    }

    private void meth5(){
        System.out.println("Private meth3 in Test");
    }

}

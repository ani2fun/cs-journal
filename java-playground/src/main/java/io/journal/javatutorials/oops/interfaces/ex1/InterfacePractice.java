package io.journal.javatutorials.oops.interfaces.ex1;

public class InterfacePractice {
    public static void main(String[] args) {
        System.out.println("--------------");
        My my = new My();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();

        System.out.println("--------------");

        Test t = my;
        t.meth1();
        t.meth2();
        Test.meth3();
        t.meth4();
        System.out.println("identifier: " + Test.identifier);
        System.out.println("--------------");

    }
}

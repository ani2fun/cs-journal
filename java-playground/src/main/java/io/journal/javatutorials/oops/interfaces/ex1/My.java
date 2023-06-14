package io.journal.javatutorials.oops.interfaces.ex1;

public class My implements Test {

    @Override
    public void meth1() {
        System.out.println("Meth1 of My");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 of My");
    }

    // @Override
    public void meth3() {
        System.out.println("meth3 of My. NOT Overridden. It's independent method with same name of static method in Test");

    }
}

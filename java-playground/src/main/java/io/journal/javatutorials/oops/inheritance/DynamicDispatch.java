package io.journal.javatutorials.oops.inheritance;

public class DynamicDispatch {
    public static String line = "----------------";
    public static void main(String[] args) {
        System.out.println();
        Super su1= new Super();
        su1.meth1();
        su1.meth2();
        System.out.println(line);
        Super su2= new Sub();
        su2.meth1();
        su1.meth1();
        System.out.println(line);
        Sub su3 = new Sub();
        su3.meth1();
        su3.meth2();
        su3.meth3();
        System.out.println(line);
    }
}

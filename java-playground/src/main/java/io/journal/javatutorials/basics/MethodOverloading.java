package io.journal.javatutorials.basics;

public class MethodOverloading {

    private static String line = "--------------------------";

    private static void max(byte a, byte b) {
        System.out.println("Byte max");
        System.out.println(line);
    }

    private static void max(int a, int b) {
        System.out.println("int max");
        System.out.println(line);
    }

    private static void max(float a, float b) {
        System.out.println("float max");
        System.out.println(line);
    }

    private static void max(long a, long b) {
        System.out.println("long max");
        System.out.println(line);
    }


    /*
    // error: method max(int,int) is already defined in class MethodOverloading
    // This is not method overloading. return type is different.
    private static boolean max(int a, int b) {
        System.out.println("long max");
        System.out.println(line);
        return false;
    }


    // this is different method but has same name. Not Overloading
    private static void max(int a, int b, int c) {
        System.out.println("max with 3 args");
        System.out.println(line);
    }
    */


    public static void main(String[] args) {
        byte a = 10, b = 5;

        max(a, b);

        max(10, 5);
        max(10l, 5l);
        max(10f, 5f);
    }
}

package io.journal.javatutorials.basics;

public class DataTypes {
    byte b1;
    short s1;
    int i1;
    long l1;

    float f1;
    double d1;

    char c1;
    boolean bool1;

    public static void main(String[] args) {
        DataTypes d = new DataTypes();
        // -------- PRIMITIVE DATA TYPES --------

        // --- INTEGRAL DATA TYPES ---
        System.out.println("--- INTEGRAL DATA TYPES ---");
        // "byte" (1 byte) -> RANGE: -128 to 127
        byte b2 = -128;
        System.out.println("byte: " + " takes: (" + Byte.BYTES + " byte) -> RANGE:[" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE + "] | default: " + d.b1 + " | e.g. byte b2 = -128; o/p: " + b2);
        // "short" (2 bytes) -> RANGE: -32768 to 32767
        short s2 = 32767;
        System.out.println("short (2 bytes) -> RANGE:[" + Short.MIN_VALUE + "," + Short.MAX_VALUE + "] | default: " + d.s1 + " | e.g. short s2 = 32767;; o/p: " + s2 + " | " + " | Math.pow(2,15); o/p: " + Math.pow(2, 15));
        // "int" (4 bytes) -> RANGE: -2147483648 to 2147483647
        int i2 = 2147483647;
        System.out.println("int (4 bytes) -> RANGE:[" + Integer.MIN_VALUE + "," + Integer.MAX_VALUE + "] | default: " + d.i1 + " | e.g. int i2 = 2147483647; o/p: " + i2 + " | " + " | Math.pow(2,31); o/p: " + Math.pow(2, 31));
        long l2 = 123L;
        System.out.println("long (8 bytes) -> RANGE:[" + Long.MIN_VALUE + "," + Long.MAX_VALUE + "] | default: " + d.l1 + " | e.g. long l2 = 123L; o/p: " + l2 + " | " + " | Math.pow(2,63); o/p: " + Math.pow(2, 63));

        System.out.println("--- FLOATING DATA TYPES ---");
        float f2 = 12.12f;
        System.out.println("float (4 bytes) -> RANGE:[" + Float.MIN_VALUE + "," + Float.MAX_VALUE + "] | default: " + d.f1 + " | e.g. float f2 = 12.12f; o/p: " + f2);
        double d2 = 12.12d;
        System.out.println("double (8 bytes) -> RANGE:[" + Double.MIN_VALUE + "," + Double.MAX_VALUE + "] | default: " + d.d1 + " | e.g. double d2 = 12.12d; o/p: " + d2);

        System.out.println("--- CHARACTER DATA TYPES ---");
        char c2 = 'a';
        System.out.println("char (2 bytes) -> RANGE:[" + Character.MIN_VALUE + "," + Character.MAX_VALUE + "] | default: " + d.c1 + " | e.g. char c2 = 'a'; o/p: " + c2);

        System.out.println("--- BOOLEAN DATA TYPES ---");
        boolean bool2 = true;
        System.out.println("boolean (1 bit or 1 byte. Not fixed size) " + " | default: " + d.bool1 + " | e.g. boolean bool2 = true; o/p: " + bool2);

    }
}

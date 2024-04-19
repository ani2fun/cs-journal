package io.journal.javatutorials.oops.staticpractice;

import java.util.Date;

public class Student {
    private String rollNo;

    static private int count = 1;

    private static String assignRollNo() {
        String temp = "univ-" + new Date().getTime() + "-" + count;
        count++;
        return temp;
    }

    public Student() {
        this.rollNo = assignRollNo();
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.rollNo);
        Student student2 = new Student();
        System.out.println(student2.rollNo);
    }
}

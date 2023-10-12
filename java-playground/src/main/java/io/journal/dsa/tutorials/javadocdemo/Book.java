/**
 * @author Aniket Kakde
 * @version 1.0
 * @since 2021
 **/
package io.journal.dsa.tutorials.javadocdemo;

/** @author Aniket Kakde
 *  Class for the java documentation demo
 **/
public class Book {

    /**
     * @value 10 default value
     * */
    static int val = 10;
    String name;


    /**
     * Parameterized constructor
     * @param s Book name
     * */
    public Book(String s) {
        name = s;
    }

    /**
     * Issue a Book to a Student
     * @param roll roll number of a student
     * @throws Exception if book is not available, throws exception
     * */
    public void issue(int roll) throws Exception {

    }

    /**
     * Check of book is available
     * @param str Book name
     * @return true if book is available
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Get a name of the book
     * @param id id of the book of type int
     * @return name of the book in a string
     */
    public String getName(int id) {
        return "java playground";
    }
}

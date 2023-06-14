package io.journal.javatutorials.basics;

public class Unicodes {
    public static void main(String[] args) {

        char pi = 0x03D6;
        System.out.println(pi + " ");

        for (char c = 0x900; c <= 0x0970; c++) {
            System.out.print(c + " ");
        }

    }
}

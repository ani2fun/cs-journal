package io.journal.javatutorials.oops.multithreading;

public class MyThread extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i <= 9999) {
            System.out.println(i + " MyThread Hello");
            i++;
        }
    }
}

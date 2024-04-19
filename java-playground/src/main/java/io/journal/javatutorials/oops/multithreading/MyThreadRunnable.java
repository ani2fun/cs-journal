package io.journal.javatutorials.oops.multithreading;

public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 9999) {
            System.out.println(i + " MyThreadRunnable Hello!");
            i++;
        }
    }
}

package io.journal.javatutorials.concurrency;

// Deadlock Example
public class DeadLockExample {

    public static void main(String args[]) {
        DeadLock deadlock = new DeadLock();
        try {
            deadlock.runTest();
        } catch (InterruptedException ie) {
        }
    }
}

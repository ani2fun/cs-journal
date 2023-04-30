package io.journal.zryouts;

public class SimpleRunnable implements Runnable {

    private String message;

    public SimpleRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread: " + e.getMessage());
        }
        System.out.println(this.message);
    }
}

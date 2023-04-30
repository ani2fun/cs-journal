package io.journal.zryouts;

import java.util.concurrent.*;

public class App implements Runnable{
    static int count = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable runnable = new App();
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("Hello ---> " + t.getState());

    }

    @Override
    public void run() {

    }
}

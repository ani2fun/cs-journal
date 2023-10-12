package io.journal.javatutorials.oops.multithreading;

public class ThreadTest {
    public static void main(String[] args) {
//        Using Thread class
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.setPriority(10);
        myThread.start();

        System.out.println("myThread.getPriority(): " + myThread.getPriority());
        System.out.println("myThread.isDaemon(): " + myThread.isDaemon());
        System.out.println("myThread.getState(): " + myThread.getState());
        System.out.println("Thread.activeCount() " + Thread.activeCount());

//        Using Runnable interface
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);
        thread.start();
        System.out.println("thread.getPriority(): " + thread.getPriority());
        System.out.println("thread.isDaemon(): " + thread.isDaemon());
        System.out.println("thread.getState(): " + thread.getState());

//        Main Thread
        int i = 0;
        while (i <= 9999) {
            System.out.println(i + " World!");
            i++;
        }
    }
}

package io.journal.javatutorials.oops.interfaces.phones;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {

    public void videoCall() {
        System.out.println("Smart phone video calling.");
    }

    @Override
    public void click() {
        System.out.println("Smart phone clicking photo.");
    }

    @Override
    public void record() {
        System.out.println("Smart phone recording video.");
    }

    @Override
    public void play() {
        System.out.println("Smart phone start playing music.");
    }

    @Override
    public void stop() {
        System.out.println("Smart phone stop playing music.");
    }
}

package io.journal.javatutorials.oops.interfaces.market;

public class Customer implements Member {
    @Override
    public void callback() {
        System.out.println("Customer callback.");
    }
}

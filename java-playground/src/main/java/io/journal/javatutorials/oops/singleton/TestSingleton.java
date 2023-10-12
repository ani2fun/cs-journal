package io.journal.javatutorials.oops.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        // ERROR: 'CoffeeMachine()' has private access in 'io.journal.javatutorials.oops.singleton.CoffeeMachine'
        //  CoffeeMachine c = new CoffeeMachine();

        CoffeeMachine a = CoffeeMachine.getInstance();
        CoffeeMachine b = CoffeeMachine.getInstance();
        CoffeeMachine c = CoffeeMachine.getInstance();

        CoffeeMachine.printHashcode('a', a.hashCode());
        CoffeeMachine.printHashcode('b', b.hashCode());
        CoffeeMachine.printHashcode('c', c.hashCode());

    }
}

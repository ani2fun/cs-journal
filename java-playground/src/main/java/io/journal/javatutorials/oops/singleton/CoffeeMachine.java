package io.journal.javatutorials.oops.singleton;

/*
The main difference between the simple constructor and the private constructor is that
in the case of the simple constructor, the object of the class can be easily created
outside the same class, but in the case of the private constructor, we cannot create
the object outside the same class (object should be created within own class).
We need to use static methods in order to access the private constructors outside their own class.
Furthermore, we will take a close look in the later section of the article about the practical implementation
of private constructors in Java.
**/

// https://www.scaler.com/topics/private-constructor-in-java/

public class CoffeeMachine {
    private int coffeeQty;
    private int waterQty;

    static private CoffeeMachine coffeeMachineInstance = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 2;
    }

    public static CoffeeMachine getInstance() {
        if (coffeeMachineInstance == null) {
            coffeeMachineInstance = new CoffeeMachine();
        }
        return coffeeMachineInstance;
    }

    static void printHashcode(char x, int hc) {
        System.out.println("Hashcode of variable " + x + " is " + hc);
    }

    public static void main(String[] args) {
        CoffeeMachine c = new CoffeeMachine();
    }
}

package io.journal.tutorials.oops.abstraction;

public class AbstractMain {
    public static void main(String args[]) {
        // Creating the objects
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal sheep = new Sheep();

        dog.makeSound();    // Calling methods from Dog
        dog.move();         // calling non-abstract method in abstract class

        cat.makeSound();    // Calling methods from Cat
        cat.move();         // calling non-abstract method in abstract class

        sheep.makeSound();  // Calling methods from Sheep
        sheep.move();       // calling non-abstract method in abstract class
    }
}

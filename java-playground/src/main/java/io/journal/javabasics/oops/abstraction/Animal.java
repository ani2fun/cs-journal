package io.journal.javabasics.oops.abstraction;


/**
 * Abstract class#
 * An abstract class is a class which is declared using the keyword abstract.
 * Rules to be followed#
 * An abstract class cannot be instantiated i.e. one cannot create an object of an abstract class.
 * <p>
 * An abstract class can have the declaration of abstract method(s)
 * (as an abstract method’s body cannot be implemented in an abstract class) but it is not compulsory to have any.
 * <p>
 * Non-abstract/normal methods can be implemented in an abstract class.
 * <p>
 * To use an abstract class it needs to be inherited from.
 * <p>
 * The class which inherits from the abstract class must implement all the abstract methods declared in the parent abstract class.
 * <p>
 * An abstract class can have everything else as SAME as a NORMAL Java class has i.e. constructor, static variables and methods.
 */


/**
 * Abstract methods#
 * A method with the keyword abstract in its declaration is known as an abstract method.
 * <p>
 * Rules to be followed#
 * In contrast to a concrete/normal Java method an abstract method does not have a body/definition
 * i.e. it only has a declaration or method signature inside an abstract class or an interface (more on these later).
 * <p>
 * An abstract method can be declared inside an abstract class or an interface only.
 * <p>
 * In other words, it can be said that to contain any abstract method in its implementation a class has to be declared
 * as an abstract class because non-abstract classes cannot have abstract methods.
 * <p>
 * An abstract method cannot be declared private as it has to be implemented in some other class.
 */

abstract class Animal {

    public abstract void makeSound();

    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving");
        //getClass().getSimpleName() is an inbuilt functionality of Java
        //to get the class name from which the method is being called
    }

}
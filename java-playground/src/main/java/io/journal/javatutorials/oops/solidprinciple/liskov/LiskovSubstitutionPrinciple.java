package io.journal.javatutorials.oops.solidprinciple.liskov;

// https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/

public class LiskovSubstitutionPrinciple {
    static void getAreaTest(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        getAreaTest(rc);

        Rectangle sq = new Square();
        sq.setWidth(5);
        getAreaTest(sq);
    }
}

/*
The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any method that expects an object of class A and the method should not give any weird output in that case.
This is the expected behavior, because when we use inheritance we assume that the child class inherits everything that the superclass has. The child class extends the behavior but never narrows it down.

Liskov's principle is easy to understand but hard to detect in code. So let's look at an example.

"Rectangle.class"

We have a simple Rectangle class, and a getArea function which returns the area of the rectangle.
Now we decide to create another class for Squares. As you might know, a square is just a special
type of rectangle where the width is equal to the height.
Our Square class extends the Rectangle class. We set height and width to the same value in the constructor,
but we do not want any client (someone who uses our class in their code) to change height or weight in a way
that can violate the square property.

"Square.class"

Therefore we override the setters to set both properties whenever one of them is changed.
But by doing that we have just violated the Liskov substitution principle.

Let's create a main class to perform tests on the getArea function.
"LiskovSubstitutionPrinciple.class"
In above example:
"getArea()" function fails to pass the test for square objects.
In the first test, we create a rectangle where the width is 2 and the height is 3 and call getAreaTest.
The output is 20 as expected, but things go wrong when we pass in the square.
This is because the call to setHeight function in the test is setting the width as well and results in an unexpected output.

* */
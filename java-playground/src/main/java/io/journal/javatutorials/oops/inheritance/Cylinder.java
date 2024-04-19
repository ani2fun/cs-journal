package io.journal.javatutorials.oops.inheritance;

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }

}

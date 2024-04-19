package io.journal.javatutorials.oops.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;

        System.out.println("--- Cylinder ---");
        System.out.println("volume: "+ c.volume());
        System.out.println("area: "+ c.volume());
    }
}

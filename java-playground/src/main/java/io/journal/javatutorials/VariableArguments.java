package io.journal.javatutorials;

public class VariableArguments {

    static void show(int y, int... x) {
        System.out.println("y: " + y);
        System.out.print("x: ");
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String... args) {
        show(10);
        show(10, 20, 30);
        show(10, new int[]{1, 2, 3, 4});
    }
}

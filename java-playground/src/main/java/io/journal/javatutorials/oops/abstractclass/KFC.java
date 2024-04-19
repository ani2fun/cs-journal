package io.journal.javatutorials.oops.abstractclass;

abstract class KFC {

    KFC() {
        System.out.println("KFC initialised.");
    }

    void makeItem() {
        System.out.println("KFC MakeItem Recipe");
    }

    public final void addSecretIngredient() {
        System.out.println("KFC Add Ingredient");
    }

    abstract public void billing();

    abstract public void offer();
}

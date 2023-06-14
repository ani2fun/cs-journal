package io.journal.javatutorials.oops.abstractclass;

class MyKFC extends KFC {

    @Override
    public void makeItem(){
        System.out.println("MyKFC Make Item Recipe");
    }


    /* Following not possible: "Method declared FINAL in abstract can not be modified in Sub-classes."

    @Override
    public final void addSecretIngredient() {
        System.out.println("KFC Add Ingredient");
    }
    */


    @Override
    public void billing() {
        System.out.println("MyKFC Billing.");
    }

    @Override
    public void offer() {
        System.out.println("MyKFC Offers.");
    }

    void festivalOffer() {
        System.out.println("MyKFC Festival Offers.");
    }
}

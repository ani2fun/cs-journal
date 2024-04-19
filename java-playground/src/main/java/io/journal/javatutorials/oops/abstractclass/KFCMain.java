package io.journal.javatutorials.oops.abstractclass;

public class KFCMain {
    public static void main(String[] args) {
        KFC kfc = new MyKFC();
        kfc.billing();
        kfc.offer();
        kfc.makeItem();
    }
}

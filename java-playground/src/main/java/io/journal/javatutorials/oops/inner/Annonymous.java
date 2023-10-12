package io.journal.javatutorials.oops.inner;

abstract class My {
    abstract void display();
}

interface My1 {
    void display();
}

public class Annonymous {

    public void toto() {
        My my = new My() {
            @Override
            void display() {
                System.out.println("Annonymous display method impl using abstract class");
            }
        };

        my.display();
    }

    public void toto1() {
        My1 my1 = new My1() {
            @Override
            public void display() {
                System.out.println("Annonymous display method impl using interface ");
            }
        };

        my1.display();
    }
}

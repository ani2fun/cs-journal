package io.journal.javatutorials.oops.inner;

public class TestVariousInnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        o.new Inner().innerDisplay();
        o.new Inner().new InnerInner().innerinnerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();


        Local local = new Local();
        local.display();


        Annonymous annonymous = new Annonymous();
        annonymous.toto();
        annonymous.toto1();

        // Static inner class

        OuterS.Inner inner1 = new OuterS.Inner();
        inner1.display();

    }
}

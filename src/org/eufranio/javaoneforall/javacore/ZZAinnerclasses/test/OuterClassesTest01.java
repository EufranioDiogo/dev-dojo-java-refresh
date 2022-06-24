package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Eufránio Diogo";

    class Inner {
        public void printThingsOfOuterClassAndInner() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }

        @Override
        public String toString() {
            return "I'm the inner class";
        }
    }

    @Override
    public String toString() {
        return "I'm the OuterClassesTest01";
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();

        Inner inner = outerClassesTest01.new Inner();

        inner.printThingsOfOuterClassAndInner();
    }
}

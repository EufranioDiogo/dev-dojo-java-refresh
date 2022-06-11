package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest03 {
    private String name = "Eufránio";

    static class Inner {
        public void printOuterClassName() {
            System.out.println(new OuterClassesTest03().name);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();

        inner.printOuterClassName();
    }
}

package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassName() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();

        OuterClassesTest01.Inner inner = outerClassesTest01.new Inner();

        inner.printOuterClassName();
    }
}

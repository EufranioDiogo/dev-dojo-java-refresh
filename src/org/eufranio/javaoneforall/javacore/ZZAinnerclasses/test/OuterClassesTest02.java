package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Eufránio";

    void print() {
        class LocalClass {
            public void printNameOfOuterClass() {
                System.out.println(name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printNameOfOuterClass();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();

    }
}

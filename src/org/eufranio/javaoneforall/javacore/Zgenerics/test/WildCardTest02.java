package org.eufranio.javaoneforall.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);
    }
    private static void printConsult(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    private static void printConsultDog(List<? super  Dog> animals) {
        for (Object object : animals) {
            if (object instanceof Dog) {
                Dog d = (Dog) object;
                d.consult();
            }
        }
    }
}

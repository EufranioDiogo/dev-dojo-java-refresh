package org.eufranio.javaoneforall.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("Dog Consult");
    }
}

class Cat extends Animal {

    @Override
    public void consult() {
        System.out.println("Cat Consult");
    }
}
public class WildCardTest01 {
    public static void main(String[] args) {
        Animal[] dogs = {new Dog(), new Dog()};
        Animal[] cats = {new Cat(), new Cat()};

        printConsult(dogs);
        printConsult(cats);
    }
    private static void printConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
        animals[1] = new Cat();
    }
}

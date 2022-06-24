package org.eufranio.javaoneforall.javacore.ZZAinnerclasses.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal dog1 = new Dog();

        dog1.walk();

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Something is walking");
            }
        };

        animal.walk();

        Dog dog2 = new Dog() {
            @Override
            public void walk() {
                System.out.println("Running");
            }
        };

        dog2.walk();

        Animal dog3 = new Dog() {
            @Override
            public void walk() {
                super.walk();
            }
        };

        dog3.walk();
    }
}

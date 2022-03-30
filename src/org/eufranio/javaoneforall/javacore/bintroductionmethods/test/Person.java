package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

public class Person {
    //coupling: is the characteristic that your class need to have, that means if some wrong that is inserted into the
    // class you need to care this data, and prevent it to break all structure already working.
    //

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

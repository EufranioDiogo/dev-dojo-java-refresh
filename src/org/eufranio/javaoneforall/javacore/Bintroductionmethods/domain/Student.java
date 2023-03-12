package org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public  char gender;
    @Deprecated
    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*** Decreasing  Cohesion,
     * because the Student Class is already with functionality of
     * printing itself and it's not the objective
     ***/
    public void print() {
        System.out.println("-------------------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

package org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain;

public class Student {
    public String name;
    public int age;
    public  char gender;

    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

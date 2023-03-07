package org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain;

import java.util.Arrays;

public class Professor {
    public String name;
    public String mainSubject;
    public int age;
    public  char gender;
    public String[] subjects;

    public Professor(String name, String mainSubject, int age, char gender) {
        this.name = name;
        this.mainSubject = mainSubject;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Professor{\n" +
                "name='" + name + "' \n" +
                ", mainSubject='\n" + mainSubject + "' \n" +
                ", age=" + age + "\n" +
                ", gender=" + gender + "\n" +
                ", subjects=" + Arrays.toString(subjects) +
                "\n}";
    }
}

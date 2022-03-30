package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.setName("Victória");
        student01.setGender('F');
        student01.setAge(22);

        student02.setName("Helber");
        student02.setGender('M');
        student02.setAge(45);

        student01.print();
        student02.print();
    }
}

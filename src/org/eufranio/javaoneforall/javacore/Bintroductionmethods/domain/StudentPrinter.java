package org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    public void print(Student student) {
        student.name = student.name + "1";
        System.out.println(student);
    }
}

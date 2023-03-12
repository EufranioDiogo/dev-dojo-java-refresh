package org.eufranio.javaoneforall.javacore.Bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student("Eufránio Diogo", 22, 'M');
        Student student2 = new Student("Victória Valente", 23, 'F');

        student1.print();
        student2.print();
    }
}

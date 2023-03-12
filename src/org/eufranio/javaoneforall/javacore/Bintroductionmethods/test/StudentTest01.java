package org.eufranio.javaoneforall.javacore.Bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        StudentPrinter printer = new StudentPrinter();
        Student student1 = new Student("Eufránio Diogo", 22, 'M');
        Student student2 = new Student("Victória Valente", 23, 'F');

        printer.print(student1);
        printer.print(student2);
    }
}

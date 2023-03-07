package org.eufranio.javaoneforall.javacore.Aintroductionclasses.test;

import org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student("Eufránio Diogo", 22, 'M');
        Student student02 = new Student("Clemente Muanga", 23, 'M');

        System.out.println(student01);

        System.out.println(student02);

        System.out.println(new Student());

    }
}

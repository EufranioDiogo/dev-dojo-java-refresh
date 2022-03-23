package org.eufranio.javaoneforall.javacore.aintroduction.test;

import org.eufranio.javaoneforall.javacore.aintroduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Eufránio Diogo");
        student.setAge(21);
        student.setGender('M');

        System.out.println(student);
    }
}

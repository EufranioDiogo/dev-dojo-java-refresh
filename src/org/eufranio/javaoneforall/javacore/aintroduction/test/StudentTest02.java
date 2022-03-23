package org.eufranio.javaoneforall.javacore.aintroduction.test;

import org.eufranio.javaoneforall.javacore.aintroduction.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("Creuma Kuzola", 22, 'F');

        System.out.println(student);
        System.out.println(student2);
    }
}

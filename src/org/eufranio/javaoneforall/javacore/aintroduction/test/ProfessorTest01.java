package org.eufranio.javaoneforall.javacore.aintroduction.test;

import org.eufranio.javaoneforall.javacore.aintroduction.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setName("Yuri Domingos");
        professor.setAge(23);
        professor.setGender('M');

        System.out.println(professor.toString());
    }
}

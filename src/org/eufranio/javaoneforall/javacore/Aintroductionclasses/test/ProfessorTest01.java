package org.eufranio.javaoneforall.javacore.Aintroductionclasses.test;

import org.eufranio.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Kami", "Math 1", 75, 'M');
        Professor professor02 = new Professor("Olivia", "Portuguese", 35, 'F');

        professor02.subjects = new String[]{"Echonomi", "Phylosofy", "Algebra"};

        System.out.println(professor01);
        System.out.println(professor02);

    }
}

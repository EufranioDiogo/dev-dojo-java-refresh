package org.eufranio.javaoneforall.Gassociation.test;

import org.eufranio.javaoneforall.Gassociation.domain.Place;
import org.eufranio.javaoneforall.Gassociation.domain.Professor;
import org.eufranio.javaoneforall.Gassociation.domain.Seminar;
import org.eufranio.javaoneforall.Gassociation.domain.Student;

public class AssociationExercise01 {
    public static void main(String[] args) {
        Place place = new Place("1º De Maio");
        Student student01 = new Student("Eufránio", 21);
        Student[] seminarStudents = {student01};
        Seminar seminar01 = new Seminar("How to learn Java",  seminarStudents, place);
        Seminar[] seminars = {seminar01};
        Professor professor01 = new Professor("Creuma", "Progamming", seminars);
        professor01.print();
    }
}

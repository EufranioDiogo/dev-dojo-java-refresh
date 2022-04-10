package org.eufranio.javaoneforall.javacore.Gassociation.domain;

import java.util.Arrays;

public class Seminar {
    private String title;
    private Student[] students;
    private Place seminarPlace;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public Seminar(String title, Place seminarPlace) {
        this.title = title;
        this.seminarPlace = seminarPlace;
    }

    public Seminar(String title, Student[] students, Place seminarPlace) {
        this.title = title;
        this.students = students;
        this.seminarPlace = seminarPlace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getSeminarPlace() {
        return seminarPlace;
    }

    public void setSeminarPlace(Place seminarPlace) {
        this.seminarPlace = seminarPlace;
    }

    @Override
    public String toString() {
        if (this.students != null) {
            return "Seminar{" +
                    "title='" + title + '\'' +
                    ", students=" + Arrays.toString(students) +
                    ", seminarPlace=" + seminarPlace +
                    '}';
        }
        return "Seminar{" +
                "title='" + title + '\'' +
                ", seminarPlace=" + seminarPlace +
                '}';
    }
}

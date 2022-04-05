package org.eufranio.javaoneforall.Gassociation.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminarMinisteredList;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminarMinisteredList) {
        this.name = name;
        this.researchField = researchField;
        this.seminarMinisteredList = seminarMinisteredList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminarMinisteredList() {
        return seminarMinisteredList;
    }

    public void setSeminarMinisteredList(Seminar[] seminarMinisteredList) {
        this.seminarMinisteredList = seminarMinisteredList;
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("Professor's name: " + this.name);

        if (seminarMinisteredList != null) {
            for (Seminar seminar : this.seminarMinisteredList) {
                System.out.println(seminar);
            }
        }
    }
}

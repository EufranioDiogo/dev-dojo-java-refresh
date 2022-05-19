package org.eufranio.javaoneforall.javacore.Xserialization.domain;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 6372806264774480445L;
    private Long id;
    private String name;
    private transient String password;
    private transient Seminar seminar;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(@NotNull ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(this.seminar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(@NotNull ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String seminarName = ois.readUTF();

            this.setSeminar(new Seminar(seminarName));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", seminar='" + seminar + '\'' +
                '}';
    }
}

package org.eufranio.javaoneforall.javacore.Xserialization.test;

import org.eufranio.javaoneforall.javacore.Xserialization.domain.Seminar;
import org.eufranio.javaoneforall.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Eufránio Diogo", "Olamundo");
        Seminar seminar = new Seminar("Special Seminar from DevDojo");

        student.setSeminar(seminar);

        serialize(student);
        deserialize(student);
    }

    private static void serialize(Student student) {
        Path studentSerializationFile = Paths.get("folder/student.ser");
        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(studentSerializationFile))
                ) {
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserialize(Student student) {
        Path studentSerializationFile = Paths.get("folder/student.ser");
        try (
                ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(studentSerializationFile))
        ) {
            Student studentRetrieved = (Student) objectInputStream.readObject();

            System.out.println(studentRetrieved);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

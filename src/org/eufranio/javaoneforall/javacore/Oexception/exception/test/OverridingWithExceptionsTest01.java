package org.eufranio.javaoneforall.javacore.Oexception.exception.test;

import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Employee;
import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;
import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.save();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        employee.save();
    }
}

package org.eufranio.javaoneforall.javacore.Labstractclasses.test;

import org.eufranio.javaoneforall.javacore.Labstractclasses.domain.Developer;
import org.eufranio.javaoneforall.javacore.Labstractclasses.domain.Employee;
import org.eufranio.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        //Employee employee = new Employee("Eufránio Diogo", 1000);
        Manager manager = new Manager("Creuma Kuzola", 3000);
        Developer developer = new Developer("Joana Pascual", 4500);

        //System.out.println(employee);
        System.out.println(manager);
        System.out.println(developer);
        developer.print();
    }
}

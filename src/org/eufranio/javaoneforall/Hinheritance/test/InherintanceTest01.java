package org.eufranio.javaoneforall.Hinheritance.test;

import org.eufranio.javaoneforall.Hinheritance.domain.Address;
import org.eufranio.javaoneforall.Hinheritance.domain.Employee;
import org.eufranio.javaoneforall.Hinheritance.domain.Manager;

public class InherintanceTest01 {
    public static void main(String[] args) {
        Address address = new Address("Trav Macau", "132");
        Employee employee01 = new Employee("Yuri Domingos", "345", address, 1000000F);
        Manager manager01 = new Manager("Luwawa Esperança", "394",
                new Address("Bento da Cruz", "302"), 250000F, "IT");

        System.out.println(employee01);
        System.out.println(manager01);

    }
}

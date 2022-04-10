package org.eufranio.javaoneforall.javacore.Hinheritance.test;

import org.eufranio.javaoneforall.javacore.Hinheritance.domain.Address;
import org.eufranio.javaoneforall.javacore.Hinheritance.domain.Employee;
import org.eufranio.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InherintanceTest02 {
    // 0 - Static init block from superclass is executed
    // 1 - Static init block from subclass is executed
    // 2 - Memory allocated for super class
    // 3 - Init values for superclass attributes
    // 4 - Initialization block of superclass is executed
    // 5 - Superclass constructor is executed
    // 6 - Memory allocated for subclass
    // 7 - Init of default values for attributes of subclass
    // 8 - Initialization block of subclass
    // 9 - Subclass constructor is executed
    public static void main(String[] args) {
        Address address = new Address("Trav Macau", "132");
        Employee employee01 = new Employee("Yuri Domingos", "345", address, 1000000F);
        Manager manager01 = new Manager("Luwawa Esperança", "394",
                new Address("Bento da Cruz", "302"), 250000F, "IT");

    }
}

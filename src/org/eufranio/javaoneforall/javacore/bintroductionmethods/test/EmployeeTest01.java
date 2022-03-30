package org.eufranio.javaoneforall.javacore.bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee01 = new Employee();
        Employee employee02 = new Employee();
        
        employee01.setName("Gilson Santos");
        employee01.setAge(22);
        employee01.setSalaries(
                1000000.0F,
                200450.0F,
                756700.0F
        );


        employee02.setName("Maria  Pereira");
        employee02.setAge(20);
        employee02.setSalaries(
                450500.0F,
                200450.0F,
                756700.0F
        );

        employee01.print();
        employee02.print();
    }
}

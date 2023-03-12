package org.eufranio.javaoneforall.javacore.Bintroductionmethods.test;

import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.Employee;
import org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain.SalaryCalculator;

import java.util.List;

public class EmployeeTest01 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Yuri Domingos", 23, new Double[]{1000D, 2000D, 300D}),
                new Employee("Creuma Kuzola", 22, new Double[]{3000D, 5000D, 3330D}),
                new Employee("Eufránio Diogo", 22, null)
        );

        employees.forEach(employee -> {
            if (employee.getSalary().length <= 0) {
                System.out.println("Not salaries setted");
                return;
            }

            Double total = 0.0D;

            for (Double salary : employee.getSalary()) {
                total += salary;
            }

            System.out.println("Average Salary: " + (total / employee.getSalary().length) + "$");
        });
    }
}

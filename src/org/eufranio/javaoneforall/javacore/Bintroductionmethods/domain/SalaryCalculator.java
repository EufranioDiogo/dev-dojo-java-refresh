package org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain;


import java.util.function.Consumer;
import java.util.function.Function;

public class SalaryCalculator<T> implements Consumer<T> {
    @Override
    public void accept(Object o) {
        if (o instanceof Employee) {
            Employee employee = (Employee) o;

            if (employee.getSalary().length <= 0) {
                System.out.println("Not salaries setted");
                return;
            }

            Double total = 0.0D;

            for (Double salary : employee.getSalary()) {
                total += salary;
            }

            System.out.println("Average Salary: " + (total / employee.getSalary().length) + "$");
        }

    }
}

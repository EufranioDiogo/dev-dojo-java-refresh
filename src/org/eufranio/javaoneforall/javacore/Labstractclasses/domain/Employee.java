package org.eufranio.javaoneforall.javacore.Labstractclasses.domain;

public abstract class Employee extends Person {
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateNewSalary();
    }

    public abstract void calculateNewSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

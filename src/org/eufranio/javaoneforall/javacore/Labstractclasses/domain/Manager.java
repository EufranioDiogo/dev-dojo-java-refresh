package org.eufranio.javaoneforall.javacore.Labstractclasses.domain;

public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateNewSalary() {
        this.salary = this.salary * 0.05 + this.salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public void print() {

    }

}

package org.eufranio.javaoneforall.javacore.bintroductionmethods.domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private float[] salaries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getSalaries() {
        return salaries;
    }

    public void setSalaries(float... salaries) {
        if (salaries.length == 3) {
            this.salaries = salaries;
        } else {
            System.err.println("Should insert 3 salaries");
        }
    }

    public float getSalariesAverage() {
        if (this.salaries.length != 3) {
            System.err.println("Salaries not defined");
        } else {
            float totalSalary = 0.0F;

            for (float salary : this.salaries) {
                totalSalary += salary;
            }

            return totalSalary / this.salaries.length;
        }
        return 0.0F;
    }

    public void print() {
        System.out.println(this);
        System.out.println("Média Salarial: " + this.getSalariesAverage());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }
}

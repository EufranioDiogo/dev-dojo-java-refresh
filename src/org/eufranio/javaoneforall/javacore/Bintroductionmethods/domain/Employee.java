package org.eufranio.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private Integer age;
    private Double[] salary;

    public Employee(String name, Integer age, Double[] salary) {
        this.name = name;
        this.age = age;
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double[] getSalary() {
        return salary;
    }

    public void setSalary(Double[] salary) {
        if (salary == null) {
            salary = new Double[]{};
        }

        if (salary.length > 3) {
            salary = new Double[]{salary[0], salary[1], salary[2]};
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

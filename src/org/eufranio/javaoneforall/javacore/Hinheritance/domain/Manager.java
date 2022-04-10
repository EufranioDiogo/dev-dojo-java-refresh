package org.eufranio.javaoneforall.javacore.Hinheritance.domain;

public class Manager extends Employee {
    private String department;

    static {
        System.out.println("Manager.static initializer");
    }

    {
        System.out.println("Manager.instance initializer 1");
    }

    {
        System.out.println("Manager.instance initializer 2");
    }
    public Manager(String name, String socialSecurityNumber, Address address, float salary, String department) {
        super(name, socialSecurityNumber, address, salary);
        System.out.println("Manager.Manager");
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void paymentReport() {
        System.out.println("The employee " + this.name + " from the department: " + this.department + " received a salary of: " + this.salary + " AOA");
    }

    @Override
    public String toString() {
        return super.toString() + " - Manager{" + "department='" + department + '\'' + '}';
    }
}

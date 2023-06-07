package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> employees;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
        System.out.println("Subordinates:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
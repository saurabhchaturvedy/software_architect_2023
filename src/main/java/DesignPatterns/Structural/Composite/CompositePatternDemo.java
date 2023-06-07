package DesignPatterns.Structural.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create developers
        Employee developer1 = new Developer("John", "Senior Developer");
        Employee developer2 = new Developer("Lisa", "Junior Developer");

        // Create managers
        Employee manager1 = new Manager("Mike", "Engineering Manager");
        Employee manager2 = new Manager("Emily", "Project Manager");

        // Add developers to manager1
        ((Manager) manager1).addEmployee(developer1);
        ((Manager) manager1).addEmployee(developer2);

        // Add manager1 and manager2 to manager2
        ((Manager) manager2).addEmployee(manager1);
        ((Manager) manager2).addEmployee(manager2);

        // Display details of manager2
        manager2.displayDetails();
    }
}
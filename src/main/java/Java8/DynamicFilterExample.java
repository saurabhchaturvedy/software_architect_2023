package Java8;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class DynamicFilterExample {
    public static <T> List<T> filterByAttribute(List<T> items, String attribute, Object value) {
        return items.stream()
            .filter(item -> {
                try {
                    Field field = item.getClass().getDeclaredField(attribute);
                    field.setAccessible(true);
                    Object fieldValue = field.get(item);
                    return Objects.equals(fieldValue, value);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            })
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 55000));

        String filterAttribute = "name"; // You can change this to "salary"
        String filterValue = "Alice";    // You can change this to an integer value

        List<Employee> filteredEmployees = filterByAttribute(employees, filterAttribute, filterValue);

        for (Employee employee : filteredEmployees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}

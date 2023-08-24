package DesignPatternAug2023.Creational.ShallowDeepCopy;

public class Employee implements Cloneable {


    public String name;

    public int age;

    public EmployeeAddress employeeAddress;


    Employee(String name, int age, EmployeeAddress employeeAddress) {
        this.name = name;
        this.age = age;
        this.employeeAddress = employeeAddress;
    }


    public String toString() {
        return " Name : " + name + " Age : " + age + " Address : " + employeeAddress;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Employee)) {
            return false;
        }

        Employee employeeObj = (Employee) o;
        return employeeObj.age == this.age && employeeObj.name.equalsIgnoreCase(this.name);
    }


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

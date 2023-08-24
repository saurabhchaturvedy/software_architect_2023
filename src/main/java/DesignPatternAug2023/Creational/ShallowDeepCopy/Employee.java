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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
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


//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    public Object clone() throws CloneNotSupportedException {
        Employee employee = new Employee(this.name, this.age, this.employeeAddress);
        EmployeeAddress employeeAddress1 = new EmployeeAddress(this.employeeAddress.houseNo, this.employeeAddress.streeName, this.employeeAddress.city);
        employee.setEmployeeAddress(employeeAddress1);
        return employee;
    }

}

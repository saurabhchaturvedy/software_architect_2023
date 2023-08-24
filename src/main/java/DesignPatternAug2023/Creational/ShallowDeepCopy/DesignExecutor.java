package DesignPatternAug2023.Creational.ShallowDeepCopy;

public class DesignExecutor {


    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeeAddress employeeAddress = new EmployeeAddress(20, "car wala", "noida");
        Employee employee = new Employee("Ram", 29, employeeAddress);
        Employee employeeclone = (Employee) employee.clone();

        System.out.println(employee);
        System.out.println(employeeclone);
        employeeclone.name = "Bhilawal";

        employeeclone.employeeAddress.city="Jaipur";
        System.out.println(employee);

        System.out.println(employeeclone);
    }
}

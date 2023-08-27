package TechInt.LRUCacheImpl;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeQuery {


    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        for (Map.Entry<String, Long> entry : genderCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        employeeList.stream().map(Employee::getDepartment).forEach(System.out::println);


        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        avgAge.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });


        Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getSalary));

        System.out.println("Max salary : " + max.get());


        List<Employee> joinedAfter2015 = employeeList.stream().filter(x -> x.getYearOfJoining() > 2015).collect(Collectors.toList());


        System.out.println("Employees joined after 2015 :: ");
        for (Employee e : joinedAfter2015) {
            System.out.println(e.getName());
        }


        Map<String, Long> employeeByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Employee count by department");

        employeeByDept.forEach((k, v) -> {

            System.out.println(k + " " + v);
        });


        Map<String, Double> averageSalaryByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));


        System.out.println("Average salary by department ::: ");
        averageSalaryByDept.forEach((k, v) -> {

            System.out.println(k + " " + v);
        });


        Optional<Employee> min = employeeList.stream().min(Comparator.comparing(Employee::getAge));

        System.out.println("Youngest employee :::::::: ");
        System.out.println(min.get());


        Optional<Employee> min1 = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining));

        System.out.println("Most experienced employee ::::::: ");
        System.out.println(min1.get());


        Map<String, Long> salesAndMarketing = employeeList.stream().filter(e -> e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("No. of male and female employees in sales and marketing employees ::: ");

        salesAndMarketing.forEach((k, v) -> {

            System.out.println(k + " " + v);
        });


        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);


        Map<String, List<Employee>> employessInEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for (Map.Entry<String, List<Employee>> entry : employessInEachDept.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 25 years :");
            } else {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

    }


}

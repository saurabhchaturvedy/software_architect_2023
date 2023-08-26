package DesignPatternAug2023.Behavioral.Iterator;

public class DesignExecutor {


    public static void main(String[] args) {


        Employee employee = new Employee();

        Iterator iterator = employee.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

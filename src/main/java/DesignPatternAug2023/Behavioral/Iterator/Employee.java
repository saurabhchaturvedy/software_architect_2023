package DesignPatternAug2023.Behavioral.Iterator;

public class Employee implements Iterable {

    String[] arr = {"india", "pakistan", "thailand", "mexico", "united states", "japan"};

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }


    private class EmployeeIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            while (index < arr.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return arr[index++];
            }
            return null;
        }
    }
}

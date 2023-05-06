package Fundamentals.Array;

import java.util.NoSuchElementException;

public class SecondLargest {


    public int secondLargest(int[] array) {

        if (array == null || array.length < 2) {
            throw new RuntimeException("not valid input");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) {

                second = array[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new NoSuchElementException("there is no second largest element :: ");
        }

        return second;
    }


    public static void main(String[] args) {

        int[] array = {11, 17, 67, 33, 59, 99};
        SecondLargest secondLargest = new SecondLargest();
        System.out.println("second largest is :: " + secondLargest.secondLargest(array));
    }
}

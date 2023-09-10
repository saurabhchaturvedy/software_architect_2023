package FundamentalsSep2023.Array;

import java.util.NoSuchElementException;

public class SecondLargest {


    public int secondLargest(int[] arr) {

        if (arr == null) {
            return -1;
        }

        if (arr.length < 2) {
            return -1;
        }


        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else {

                if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
        }


        if (second == Integer.MIN_VALUE) {
            throw new NoSuchElementException("no second largest value present");
        }

        return second;
    }


    public static void main(String[] args) {


        int[] arr = {7, 8, 23, 32, 18, 54, 43};

        SecondLargest secondLargest = new SecondLargest();

        System.out.println("Second largest value is ::::: " + secondLargest.secondLargest(arr));
    }
}

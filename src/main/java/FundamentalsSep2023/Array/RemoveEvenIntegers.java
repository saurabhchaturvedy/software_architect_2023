package FundamentalsSep2023.Array;

public class RemoveEvenIntegers {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int oddElements = 0;

        for (int x : arr) {
            if (x % 2 != 0) {
                oddElements++;
            }
        }

        int[] result = new int[oddElements];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Array after removing even integers ::");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

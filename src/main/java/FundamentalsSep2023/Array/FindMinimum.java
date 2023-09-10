package FundamentalsSep2023.Array;

public class FindMinimum {


    public int minimum(int[] arr) {

        int min = arr[0];

        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }

        return min;
    }


    public static void main(String[] args) {

        int[] arr = {7, 1, 9, 3, 12, 29, 16, 18, 11};

        FindMinimum findMinimum = new FindMinimum();

        System.out.println(" Minimum value is :::: " + findMinimum.minimum(arr));
    }
}

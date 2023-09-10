package FundamentalsSep2023.Array;

public class FindMaximum {


    public int maximum(int[] arr) {

        int max = arr[0];

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 14, 12, 18, 7, 1, 5, 13};

        FindMaximum findMaximum = new FindMaximum();

        System.out.println("Maximum is :::::: " + findMaximum.maximum(arr));
    }
}

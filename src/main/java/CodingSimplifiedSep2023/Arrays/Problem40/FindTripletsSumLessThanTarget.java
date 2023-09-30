package CodingSimplifiedSep2023.Arrays.Problem40;

import java.util.Arrays;

public class FindTripletsSumLessThanTarget {


    public int tripletsSumLessThanTarget(int[] arr, int target) {

        Arrays.sort(arr);

        int triplets = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                int sum = arr[i] + arr[start] + arr[end];

                if (sum < target) {

                    triplets = triplets + (end - start);
                    start++;
                } else {

                    end--;
                }
            }
        }

        return triplets;
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, -3, 4, -2};

        FindTripletsSumLessThanTarget findTripletsSumLessThanTarget = new FindTripletsSumLessThanTarget();

        int triplets = findTripletsSumLessThanTarget.tripletsSumLessThanTarget(arr, 1);

        System.out.println("No of triplets having sum less than target sum :: " + triplets);
    }
}

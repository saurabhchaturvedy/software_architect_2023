package CodingSimplifiedSep2023.Arrays.Problem30;

public class FindMaxMultiplication {


    public int findMaxMultiplication(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }

        if (arr.length == 2) {
            return arr[0] * arr[1];
        }


        int min = arr[0] < arr[1] ? arr[0] : arr[1];
        int secondMin = arr[0] > arr[1] ? arr[0] : arr[1];

        int max = arr[0] > arr[1] ? arr[0] : arr[1];
        int secondMax = arr[0] < arr[1] ? arr[0] : arr[1];

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin) {
                secondMin = arr[i];
            }

            if (arr[i] > max) {

                secondMax = max;

                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = max;
            }
        }

        int firstTwoMul = min * secondMin;
        int secondTwoMul = max * secondMax;

        return Math.max(firstTwoMul, secondTwoMul);
    }


    public static void main(String[] args) {


        int[] arr = {2, 3, 5, 7, -7, 5, 8, -5};

        FindMaxMultiplication findMaxMultiplication = new FindMaxMultiplication();

        int maxMultiplication = findMaxMultiplication.findMaxMultiplication(arr);

        System.out.println(" Max multiplication is :: " + maxMultiplication);
    }
}

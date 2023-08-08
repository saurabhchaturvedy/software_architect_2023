package CSAug2023.Arrays.Section30;

public class MaxMultiplication {


    public int maxMultplication(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for (int x : arr) {

            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {

                max2 = x;

            }


            if (x > min1) {
                min2 = min1;
                min1 = x;
            } else if (x > min2) {

                min2 = x;

            }

        }


        int max_multiplication = Math.max(max1 * max2, min1 * min2);
        return max_multiplication;
    }


    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 10, 4, 15, 3, 6};
        MaxMultiplication maxMultiplication = new MaxMultiplication();
        int multiplicationAnswer = maxMultiplication.maxMultplication(arr);

        System.out.println(" answer " + multiplicationAnswer);
    }
}

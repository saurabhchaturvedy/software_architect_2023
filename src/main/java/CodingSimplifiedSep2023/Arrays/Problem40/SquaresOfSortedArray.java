package CodingSimplifiedSep2023.Arrays.Problem40;

public class SquaresOfSortedArray {


    public int[] squaresOfSortedArray(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }


        int left = 0;
        int right = arr.length - 1;

        for (int k = arr.length - 1; k >= 0; k--) {

            if (arr[left] > arr[right]) {

                result[k] = arr[left];
                left++;
            } else {

                result[k] = arr[right];
                right--;
            }
        }

        return result;
    }


    public static void main(String[] args) {


        int[] arr = {-6, -3, -1, 2, 4, 5};

        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

        int[] ints = squaresOfSortedArray.squaresOfSortedArray(arr);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}

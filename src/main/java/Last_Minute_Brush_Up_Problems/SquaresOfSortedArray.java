package Last_Minute_Brush_Up_Problems;

public class SquaresOfSortedArray {


    public int[] squaresOfSortedArray(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int left = 0;
        int right = arr.length - 1;


        for (int pos = arr.length - 1; pos >= 0; pos--) {

            if (arr[left] > arr[right]) {
                result[pos] = arr[left];
                left++;
            } else {
                result[pos] = arr[right];
                right--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-7, -4, -1, 2, 3, 6, 10};
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        for (int x : squaresOfSortedArray.squaresOfSortedArray(arr)) {
            System.out.print(x + " ");
        }
    }
}

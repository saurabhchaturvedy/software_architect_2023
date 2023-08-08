package CSAug2023.Arrays.Section40;

public class SquareSortedArrays {


    public int[] squareSortedArrays(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[left] > arr[right]) {
                result[i] = arr[left];
                left++;
            } else {

                result[i] = arr[right];
                right--;
            }

        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        SquareSortedArrays squareSortedArrays = new SquareSortedArrays();
        int[] ints = squareSortedArrays.squareSortedArrays(arr);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}

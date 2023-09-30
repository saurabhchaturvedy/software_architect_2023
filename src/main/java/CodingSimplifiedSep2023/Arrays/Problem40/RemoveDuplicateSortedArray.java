package CodingSimplifiedSep2023.Arrays.Problem40;

public class RemoveDuplicateSortedArray {


    public int uniqueArrayLengthWithoutDuplicates(int[] arr) {

        if (arr.length <= 1) {
            return 1;
        }

        int start = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[start++] = arr[i];
            }
        }

        return start;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 2, 4, 5, 6, 6, 7, 8, 9};

        RemoveDuplicateSortedArray removeDuplicateSortedArray = new RemoveDuplicateSortedArray();

        System.out.println("Length of unique array : " + removeDuplicateSortedArray.uniqueArrayLengthWithoutDuplicates(arr));
    }
}

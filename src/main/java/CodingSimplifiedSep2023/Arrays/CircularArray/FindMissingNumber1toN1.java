package CodingSimplifiedSep2023.Arrays.CircularArray;

public class FindMissingNumber1toN1 {


    public int findMissingNumber1ToNPlus1(int[] arr) {

        if (arr.length <= 0) {
            return -1;
        }

        int i = 0;

        while (i < arr.length) {

            if (arr[i]<=arr.length && arr[i] != i + 1) {
                int destinationIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            }

            i++;
        }


        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 1};

        FindMissingNumber1toN1 findMissingNumber1toN1 = new FindMissingNumber1toN1();

        System.out.println(" Missing number is : " + findMissingNumber1toN1.findMissingNumber1ToNPlus1(arr));
    }
}

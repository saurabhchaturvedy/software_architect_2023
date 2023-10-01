package CodingSimplifiedSep2023.Arrays.Problem50;

public class SegregateOddEven {


    public int[] segregateOddEven(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            while (arr[start] % 2 == 0 && start < end) {
                start++;
            }

            while (arr[end] % 2 != 0 && start < end) {
                end--;
            }

            if (start < end) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return arr;
    }


    public static void main(String[] args) {


        int[] arr = {9, 5, 4, 3, 6, 12, 18, 17, 19, 14};

        SegregateOddEven segregateOddEven = new SegregateOddEven();

        int[] ints = segregateOddEven.segregateOddEven(arr);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}

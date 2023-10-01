package CodingSimplifiedSep2023.Arrays.Problem50;

public class Separate01 {


    public void separate01(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            while (arr[start] == 0 && start < end) {
                start++;
            }

            while (arr[end] == 1 && start < end) {
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
    }


    public static void main(String[] args) {


        int[] arr = {1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0};

        Separate01 separate01 = new Separate01();

        separate01.separate01(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

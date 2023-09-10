package FundamentalsSep2023.Array;

public class ReverseArray {


    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        for (int x : arr) {
            System.out.print(x + " ");
        }

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(arr);

        System.out.println("After reversing array :::: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

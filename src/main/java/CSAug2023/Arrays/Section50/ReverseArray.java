package CSAug2023.Arrays.Section50;

public class ReverseArray {


    public void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {

        int[] arr = {3, 9, 4, 1, 0, 17, 33};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

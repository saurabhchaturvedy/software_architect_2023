package Fundamentals.Array;

public class ReverseArray {


    public void reverse(int[] array) {

        int start = 0;
        int end = array.length - 1;

        int temp = 0;

        while (start < end) {

            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }


    }


    public static void main(String[] args) {

        int[] array = {2, 9, 8, 3, 34, 87};

        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

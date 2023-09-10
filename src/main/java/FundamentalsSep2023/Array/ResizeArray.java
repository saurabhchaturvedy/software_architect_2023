package FundamentalsSep2023.Array;

public class ResizeArray {


    public void resize(int[] arr, int capacity) {

        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ResizeArray resizeArray = new ResizeArray();

        System.out.println("Array length :::: " + arr.length);

        resizeArray.resize(arr, 20);

        System.out.println("Array length :::: " + arr.length);

    }
}

package CSAug2023.Arrays.Section10;

public class ArrayBasic {


    public void insertAtFirst(int[] arr, int val) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = val;
    }

    public void insertAtPosition(int[] arr, int val,int position) {

        for (int i = arr.length - 1; i > position-1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position-1] = val;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        ArrayBasic arrayBasic = new ArrayBasic();
        arrayBasic.insertAtFirst(arr, 67);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        arrayBasic.insertAtPosition(arr,33,4);
        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

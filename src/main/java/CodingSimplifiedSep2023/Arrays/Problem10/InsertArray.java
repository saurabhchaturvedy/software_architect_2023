package CodingSimplifiedSep2023.Arrays.Problem10;

public class InsertArray {


    public void insertAtLast(int[] arr, int x) {

        arr[arr.length - 1] = x;

    }


    public void insertAtFront(int[] arr, int x) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = x;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        InsertArray insertArray = new InsertArray();
        insertArray.insertAtLast(arr, 14);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        insertArray.insertAtFront(arr, 23);

        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

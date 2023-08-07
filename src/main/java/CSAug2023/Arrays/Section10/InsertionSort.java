package CSAug2023.Arrays.Section10;

public class InsertionSort {


    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {

        int[] arr = {2, 9, 7, 13, 8, 18, 14};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);

        for (int x : arr) {
            System.out.print(x + "  ");
        }
    }
}

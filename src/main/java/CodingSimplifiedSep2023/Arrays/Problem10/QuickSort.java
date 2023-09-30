package CodingSimplifiedSep2023.Arrays.Problem10;

public class QuickSort {


    public void quicksort(int[] arr, int start, int end) {

        if (end > start) {

            int partitionIndex = partition(arr, start, end);
            quicksort(arr, start, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {

        int pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr, i + 1, end);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {


        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {


        int[] arr = {17, 6, 11, 8, 13, 12, 5, 4, 19};
        QuickSort quickSort = new QuickSort();

        quickSort.quicksort(arr, 0, arr.length - 1);

        for (int x : arr) {

            System.out.print(x + " ");
        }
    }
}

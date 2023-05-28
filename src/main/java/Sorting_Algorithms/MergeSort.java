package Sorting_Algorithms;

public class MergeSort {


    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) >>> 1;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {

        int firstArraySize = m - l + 1;
        int secondArraySize = r - m;

        int[] left = new int[firstArraySize];
        int[] right = new int[secondArraySize];

        for (int i = 0; i < firstArraySize; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < secondArraySize; j++) {
            right[j] = arr[m + j + 1];
        }


        int i = 0;
        int j = 0;
        int k = l;


        while (i < firstArraySize && j < secondArraySize) {

            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }


        while (i < firstArraySize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < secondArraySize) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }


    public static void main(String[] args) {

        int[] arr = {2, 9, 11, 4, 8, 13, 5};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

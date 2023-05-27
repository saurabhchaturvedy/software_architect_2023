package Sorting_Algorithms;

import java.util.Arrays;

public class Quicksort {


    public void quickSort(int[] arr, int begin, int end) {

        if (end > begin) {
            int partition = partition(arr, begin, end);
            quickSort(arr, begin, partition - 1);
            quickSort(arr, partition + 1, end);
        }


    }

    private int partition(int[] arr, int begin, int end) {

        int pivot = arr[end];

        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
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

        int[] arr = {4, 11, 8, 2, 1, 9, 7};
        Quicksort quicksort = new Quicksort();
        quicksort.quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x + " ");
        });
    }
}

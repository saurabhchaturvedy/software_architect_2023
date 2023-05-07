package Fundamentals.Sorting;

public class MergeSort {


    public void mergeSort(int[] array, int low, int high) {

        if (low < high) {
            int mid = (low + high) >>> 1;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;
        int i, j, k = 0;

        int[] L = new int[n1];
        int[] R = new int[n2];


        for (i = 0; i < n1; i++) {

            L[i] = array[low + i];
        }

        for (j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = L[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] array = {7, 4, 11, 9, 34, 78, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

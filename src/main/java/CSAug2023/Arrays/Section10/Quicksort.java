package CSAug2023.Arrays.Section10;

public class Quicksort {


    public void quicksort(int[] arr, int begin, int end) {

        if (end > begin) {
            int pivotIndex = partition(arr, begin, end);
            quicksort(arr, begin, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
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

        int[] arr = {2, 9, 7, 13, 8, 18, 14};
        Quicksort quicksort = new Quicksort();
        quicksort.quicksort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

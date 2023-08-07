package CSAug2023.Arrays.Section10;

public class MergeSort {


    public void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];


        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }


        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {

                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }


        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }


        while (j < n2) {

            arr[k] = rightArr[j];
            j++;
            k++;

        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 13, 8, 18, 14};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergesort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

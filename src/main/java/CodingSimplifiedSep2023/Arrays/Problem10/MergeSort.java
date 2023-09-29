package CodingSimplifiedSep2023.Arrays.Problem10;

public class MergeSort {


    public void mergeSort(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            return;
        }

        int midIndex = len / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < len; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private void merge(int[] arr, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {

                arr[k] = rightHalf[j];
                j++;
            }

            k++;
        }


        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;

        }

        while (j < rightSize) {

            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] arr = {8, 2, 14, 6, 23, 19, 5, 33, 4, 80, 47};

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

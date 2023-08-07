package CSAug2023.Arrays.Section10;

public class SelectionSort {


    public void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 13, 8, 18, 14};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

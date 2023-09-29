package CodingSimplifiedSep2023.Arrays.Problem10;

public class SelectionSort {


    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {

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


        int[] arr = {7, 3, 18, 15, 2, 10, 23};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

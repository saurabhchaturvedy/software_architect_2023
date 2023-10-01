package CodingSimplifiedSep2023.Arrays.CircularArray;

public class CyclicSort {


    public void cyclicSort(int[] arr) {
        if (arr.length <= 0) {
            return;
        }

        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int destinationIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            }
                i++;
        }
    }


    public static void main(String[] args) {

        int[] arr = {3, 4, 6, 2, 1, 5};

        CyclicSort cyclicSort = new CyclicSort();

        cyclicSort.cyclicSort(arr);

        for (int x : arr) {

            System.out.print(x + " ");
        }
    }
}

package CSAug2023.Arrays.Section50;

public class CyclicSort {


    public void cyclicSort(int[] arr) {
        int i = 0;
        int destinationIndex = 0;
        while (i < arr.length) {
            if (arr[i] - 1 != i) {
                destinationIndex = arr[i] - 1;


                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            } else {
                i++;
            }
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

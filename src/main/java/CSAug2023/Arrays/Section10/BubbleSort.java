package CSAug2023.Arrays.Section10;

public class BubbleSort {


    public void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {2, 9, 7, 13, 8, 18, 14};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

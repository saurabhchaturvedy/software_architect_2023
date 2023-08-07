package CSAug2023.Arrays.Section20;

public class Sort012 {


    public void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            switch (arr[mid]) {

                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;


                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;

            }
        }


    }

    private void swap(int[] arr, int low, int mid) {

        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 2, 1, 1, 0, 1, 2, 1, 1, 1, 2, 2};
        Sort012 sort012 = new Sort012();
        sort012.sort012(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

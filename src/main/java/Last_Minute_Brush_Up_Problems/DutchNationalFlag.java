package Last_Minute_Brush_Up_Problems;

public class DutchNationalFlag {


    public int[] sortColors(int[] arr) {

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;


                case 1:
                    mid++;
                    break;


                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }

        return arr;
    }

    private void swap(int[] arr, int start, int mid) {

        int temp = arr[start];
        arr[start] = arr[mid];
        arr[mid] = temp;

    }


    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 1, 2, 2, 0, 1, 0, 0, 1, 2};
        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();
        for (int x : dutchNationalFlag.sortColors(arr)) {
            System.out.print(x + " ");
        }
    }
}

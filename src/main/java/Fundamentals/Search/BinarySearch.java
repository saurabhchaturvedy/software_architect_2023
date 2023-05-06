package Fundamentals.Search;

public class BinarySearch {


    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) >>> 1;

            int midVal = arr[mid];

            if (midVal == target) {
                return true;
            }

            if (midVal > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 8, 10};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 5));
    }
}

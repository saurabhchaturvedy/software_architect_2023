package CSAug2023.Arrays.Section10;

public class BinarySearch {


    public int binarySearch(int[] arr, int val) {

        if (arr.length == 0) return -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (arr[mid] == val) {
                return mid;
            }

            if (arr[mid] > val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {7, 9, 13, 25, 31, 37, 47, 55};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Is element found in the array ? " + binarySearch.binarySearch(arr, 39));
    }
}

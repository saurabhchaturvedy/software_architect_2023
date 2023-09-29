package CodingSimplifiedSep2023.Arrays.Problem10;

public class BinarySearch {


    public boolean search(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {


        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        BinarySearch binarySearch = new BinarySearch();
        boolean search = binarySearch.search(arr, 6);

        System.out.println("Was able to search the element ? " + search);
    }
}

package CodingSimplifiedSep2023.Arrays.Problem20;

public class SearchArray {


    public int searchUnsorted(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }


    public int searchSorted(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {


        int[] arr = {6, 4, 2, 13, 8, 15, 23, 30, 14};

        SearchArray searchArray = new SearchArray();

        System.out.println("Search in unsorted array : " + searchArray.searchUnsorted(arr, 23));

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("Search in sorted array : " + searchArray.searchSorted(arr2, 6));
    }
}

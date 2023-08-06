package Last_Minute_Brush_Up_Problems.Codebix;

public class SearchRotatedSortedArray {


    public int searchRotatedSortedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) >>> 1;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {

                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }

        return -1;
    }


    public static void main(String[] args) {

        int[]arr = {4,5,6,7,0,1,2};
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        System.out.println("Minimum in rotated sorted array is : "+searchRotatedSortedArray.searchRotatedSortedArray(arr,0));
    }
}

package CSAug2023.Arrays.Section20;

public class SearchSortedUnsorted {


    public int searchSorted(int[] arr, int val) {
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



    public int searchUnsorted(int[]arr,int val)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==val)
            {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[]arr = {2,4,6,8,10};
        SearchSortedUnsorted searchSortedUnsorted = new SearchSortedUnsorted();
        System.out.println("Search 6 in array "+searchSortedUnsorted.searchSorted(arr,6));

        int[]arr2 = {3,1,7,2,11,9};
        System.out.println("Search 6 in unsorted array "+searchSortedUnsorted.searchUnsorted(arr,7));

    }
}

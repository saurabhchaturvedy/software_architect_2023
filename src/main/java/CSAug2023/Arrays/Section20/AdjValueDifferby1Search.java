package CSAug2023.Arrays.Section20;

public class AdjValueDifferby1Search {


    public int searchDifferBy1(int[] arr, int val) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;

        while (start < arr.length) {

            if (arr[start] == val) {
                return start;
            }

            int diff = Math.abs(arr[start] - val);
            start = start + diff;
        }

        return -1;
    }


    public static void main(String[] args) {

        int arr1[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        AdjValueDifferby1Search adjValueDifferby1Search = new AdjValueDifferby1Search();
        System.out.println("Index of first occurence of 2 is : " + adjValueDifferby1Search.searchDifferBy1(arr1, 2));
    }
}

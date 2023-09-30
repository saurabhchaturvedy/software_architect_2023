package CodingSimplifiedSep2023.Arrays.Problem20;

public class SearchFirstOccurenceDifferByOne {


    public int searchOccurenceWhenDifferBy1(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }


        int start = 0;

        while (start < arr.length) {

            if (arr[start] == target) {
                return start;
            }

            int diff = Math.abs(arr[start] - target);
            start = start + diff;
        }

        return -1;
    }


    public static void main(String[] args) {


        int[] arr = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};

        SearchFirstOccurenceDifferByOne searchFirstOccurenceDifferByOne = new SearchFirstOccurenceDifferByOne();
        int firstIndex = searchFirstOccurenceDifferByOne.searchOccurenceWhenDifferBy1(arr, 3);

        System.out.println(" First occurence of 3 is : " + firstIndex);
    }
}

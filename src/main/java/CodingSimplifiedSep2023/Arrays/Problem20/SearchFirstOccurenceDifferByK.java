package CodingSimplifiedSep2023.Arrays.Problem20;

public class SearchFirstOccurenceDifferByK {


    public int searchOccurenceWhenDifferByK(int[] arr, int target, int k) {

        if (arr.length == 0) {
            return -1;
        }


        int start = 0;

        while (start < arr.length) {

            if (arr[start] == target) {
                return start;
            }

            int diff = Math.abs(arr[start] - target) / k;
            diff = Math.max(1, diff);
            start = start + diff;
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] arr = {20, 40, 50, 70, 70, 60};

        SearchFirstOccurenceDifferByK searchFirstOccurenceDifferByK = new SearchFirstOccurenceDifferByK();

        System.out.println("First occurence of 60 when k 20 is : " + searchFirstOccurenceDifferByK.searchOccurenceWhenDifferByK(arr, 60, 20));
    }
}

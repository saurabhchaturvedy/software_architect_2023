package CodingSimplifiedSep2023.Arrays.CircularArray;

public class FindDuplicateValue1ToN {


    public int getDuplicate1ToN(int[] arr) {

        if (arr.length <= 0) {
            return -1;
        }

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != arr[arr[i] - 1]) {
                int otherIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = temp;
            } else {

                i++;

            }
        }

        return arr[arr.length - 1];
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 1};

        FindDuplicateValue1ToN findDuplicateValue1ToN = new FindDuplicateValue1ToN();

        System.out.println(" Duplicate value : " + findDuplicateValue1ToN.getDuplicate1ToN(arr));
    }
}

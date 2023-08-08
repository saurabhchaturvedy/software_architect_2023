package CSAug2023.Arrays.Section40;

public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] arr) {

        int uniqueIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        return uniqueIndex + 1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 5, 6, 6, 7, 8, 9};

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int count = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        System.out.println("Count after removal of duplicates is : " + count);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

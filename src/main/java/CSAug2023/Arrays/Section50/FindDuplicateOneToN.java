package CSAug2023.Arrays.Section50;

public class FindDuplicateOneToN {


    public int findDuplicateOneToN(int[] arr) {
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
        ;

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 1};
        FindDuplicateOneToN findDuplicateOneToN = new FindDuplicateOneToN();
        int duplicateOneToN = findDuplicateOneToN.findDuplicateOneToN(arr);
        System.out.println("Duplicate value was : " + duplicateOneToN);
    }
}

package Last_Minute_Brush_Up_Problems.Codebix;

public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        boolean[] seen = new boolean[100000]; // Assuming a range of values

        int newSize = 0;
        for (int i = 0; i < n; i++) {
            if (!seen[arr[i]]) {
                seen[arr[i]] = true;
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        int[] resultArray = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            resultArray[i] = arr[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 2, 8, 6, 9};
        int[] result = removeDuplicates(arr);

        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        System.out.println("Array with Duplicates Removed: " + java.util.Arrays.toString(result));
    }
}

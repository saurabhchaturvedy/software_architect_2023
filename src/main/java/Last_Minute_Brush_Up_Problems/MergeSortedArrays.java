package Last_Minute_Brush_Up_Problems;

public class MergeSortedArrays {


    public int[] mergeSortedArrays(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }

            k++;
        }


        while (i < first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }


    public static void main(String[] args) {

        int[] first = {8, 10, 12, 14};
        int[] second = {3, 9, 17, 21, 23, 31};

        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] mergedArray = mergeSortedArrays.mergeSortedArrays(first, second);

        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
    }
}

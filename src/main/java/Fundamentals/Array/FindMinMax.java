package Fundamentals.Array;

public class FindMinMax {


    public int min(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public int max(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] array = {7, 3, 5, 1, 3, 2, 11};
        FindMinMax findMinMax = new FindMinMax();
        System.out.println("min in the array is : " + findMinMax.min(array));
        System.out.println("max in the array is : " + findMinMax.max(array));
    }
}

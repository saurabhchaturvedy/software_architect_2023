package Fundamentals.Array;

public class RemoveOddNumbers {


    public int[] removeOddNumbers(int[] arr) {

        int oddNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers++;
            }
        }

        int[] result = new int[oddNumbers];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        RemoveOddNumbers removeOddNumbers = new RemoveOddNumbers();
        int[] ints = removeOddNumbers.removeOddNumbers(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

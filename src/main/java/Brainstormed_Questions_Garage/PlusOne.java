package Brainstormed_Questions_Garage;

public class PlusOne {


    public int[] plusOne(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }


    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOne(new int[]{9, 9, 9});

        for (int x : ints) {
            System.out.print(x);
        }
    }
}

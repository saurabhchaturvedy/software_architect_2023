package CSAug2023.Arrays.Section60;

public class SegregateOneZero {


    public void segregateZeroOnes(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;


        while (left < right) {

            while (left < right && arr[left] == 0) {
                left++;
            }

            while (left < right && arr[right] == 1) {
                right--;
            }


            if (left < right) {


                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1};
        SegregateOneZero segregateOneZero = new SegregateOneZero();
        segregateOneZero.segregateZeroOnes(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

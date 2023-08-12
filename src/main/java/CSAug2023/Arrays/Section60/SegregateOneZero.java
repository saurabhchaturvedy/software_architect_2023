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


                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1};
    }
}

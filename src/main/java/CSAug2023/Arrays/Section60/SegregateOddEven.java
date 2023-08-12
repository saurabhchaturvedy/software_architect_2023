package CSAug2023.Arrays.Section60;

public class SegregateOddEven {


    public void segregateOddEven(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {


            while (left < right && arr[left] % 2 == 0) {
                left++;
            }


            while (left < right && arr[right] % 2 == 1) {
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

        int[] arr = {7, 4, 12, 3, 5, 8, 10, 13, 15, 18, 20, 27, 21};
        SegregateOddEven segregateOddEven = new SegregateOddEven();
        segregateOddEven.segregateOddEven(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

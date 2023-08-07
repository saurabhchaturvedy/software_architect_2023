package CSAug2023.Arrays.Section20;

public class FindMissingNumber {


    public int missingNumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {

        int arr[] = {2, 4, 1, 3, 6, 7, 8};
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int missingNumber = findMissingNumber.missingNumber(arr, arr.length + 1);

        System.out.println("missing number is : " + missingNumber);
    }
}

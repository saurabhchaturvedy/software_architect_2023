package CSAug2023.Arrays.Section50;

public class FindMissingNumberN {


    public int missingNumber1NPlus1(int[] arr) {
        int n = arr.length;
        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;

        for (int x : arr) {
            actualSum = actualSum + x;
        }

        return expectedSum - actualSum;
    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 1};
        FindMissingNumberN findMissingNumberN = new FindMissingNumberN();
        int missingNumber = findMissingNumberN.missingNumber1NPlus1(arr);
        System.out.println("Missing number is : " + missingNumber);
    }
}

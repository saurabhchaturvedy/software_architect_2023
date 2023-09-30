package CodingSimplifiedSep2023.Arrays.Problem20;

public class LeadersInArray {


    public void leadersInArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {

                max = arr[i];
                System.out.print(" Leader : " + max);
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        LeadersInArray leadersInArray = new LeadersInArray();

        leadersInArray.leadersInArray(arr);
    }
}

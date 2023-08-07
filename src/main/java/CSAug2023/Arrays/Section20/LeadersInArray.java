package CSAug2023.Arrays.Section20;

public class LeadersInArray {


    public void leadersInArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Leader is : " + max);
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {14, 15, 8, 9, 5, 2};
        LeadersInArray leadersInArray = new LeadersInArray();
        leadersInArray.leadersInArray(arr);
    }
}

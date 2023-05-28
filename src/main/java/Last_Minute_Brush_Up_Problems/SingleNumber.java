package Last_Minute_Brush_Up_Problems;

public class SingleNumber {


    public int singleNumber(int[] arr) {
        int single = arr[0];

        for (int i = 1; i < arr.length; i++) {
            single = single ^ arr[i];
        }

        return single;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 4};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println("Single number is : " + singleNumber.singleNumber(arr));
    }
}

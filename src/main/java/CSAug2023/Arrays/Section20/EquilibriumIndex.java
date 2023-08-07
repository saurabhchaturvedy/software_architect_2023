package CSAug2023.Arrays.Section20;

public class EquilibriumIndex {


    public int equilibriumIndex(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            leftSum = leftSum + arr[i];
        }


        for (int i = 0; i < arr.length; i++) {

            leftSum = leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            rightSum = rightSum + arr[i];
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();

        System.out.println("Equilibrium index is : " + equilibriumIndex.equilibriumIndex(arr));
    }
}

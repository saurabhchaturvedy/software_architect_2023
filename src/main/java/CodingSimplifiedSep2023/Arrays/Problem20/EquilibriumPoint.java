package CodingSimplifiedSep2023.Arrays.Problem20;

public class EquilibriumPoint {


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


        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        int equilibriumIndex = equilibriumPoint.equilibriumIndex(arr);

        System.out.println(" Equilibrium index : " + equilibriumIndex);
    }
}

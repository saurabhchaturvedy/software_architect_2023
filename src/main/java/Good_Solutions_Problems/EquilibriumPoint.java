package Good_Solutions_Problems;

public class EquilibriumPoint {

    public static int findEquilibriumPoint(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Iterate through the array and find the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // Subtract the current element from the total sum to get the right sum
            totalSum -= arr[i];

            // Check if the left sum is equal to the right sum
            if (leftSum == totalSum) {
                return i; // Equilibrium point found at index i
            }

            // Add the current element to the left sum for the next iteration
            leftSum += arr[i];
        }

        return -1; // Equilibrium point not found
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int equilibriumPoint = findEquilibriumPoint(arr);

        if (equilibriumPoint == -1) {
            System.out.println("No equilibrium point found.");
        } else {
            System.out.println("Equilibrium point found at index " + equilibriumPoint);
        }
    }
}

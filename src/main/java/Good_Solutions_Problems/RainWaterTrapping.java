package Good_Solutions_Problems;

public class RainWaterTrapping {
    public static int trap(int[] height) {
        if (height == null || height.length < 3)
            return 0;

        int n = height.length;
        int[] leftMax = new int[n];  // Max height to the left of each bar
        int[] rightMax = new int[n]; // Max height to the right of each bar

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int waterTrapped = trap(heights);
        System.out.println(waterTrapped); // Output: 6
    }
}

package Brainstormed_Questions_Garage;

public class TrappingRainWater {


    public int trappedRainWater(int[] height) {

        int totalTrappedWater = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {

            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < height.length; i++) {
            totalTrappedWater = totalTrappedWater + Math.min(leftMax[i], rightMax[i]) - height[i];
        }


        return totalTrappedWater;
    }


    public static void main(String[] args) {

         int[] arr = {4, 2, 0, 3, 2, 5};
       // int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int trappedRainWater = trappingRainWater.trappedRainWater(arr);

        System.out.println("Trapped rain water is = " + trappedRainWater);
    }
}

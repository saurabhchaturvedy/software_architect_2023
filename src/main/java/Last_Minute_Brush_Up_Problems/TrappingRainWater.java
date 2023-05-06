package Last_Minute_Brush_Up_Problems;

public class TrappingRainWater {


    public int getTrappedWater(int[] buildings) {
        int[] leftMax = new int[buildings.length];
        int[] rightMax = new int[buildings.length];
        int max = 0;
        int water = 0;
        int totalWater = 0;
        int n = buildings.length;

        for (int i = 0; i < buildings.length; i++) {
            max = Math.max(max, buildings[i]);
            leftMax[i] = max;
        }

        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, buildings[i]);
            rightMax[i] = max;
        }

        for (int i = n - 1; i >= 0; i--) {
            water = Math.min(leftMax[i], rightMax[i]) - buildings[i];
            totalWater = totalWater + water;
        }

        return totalWater;
    }


    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int trappedWater = trappingRainWater.getTrappedWater(arr);
        System.out.println("Trapped water is :: " + trappedWater);
    }
}

package Last_Minute_Brush_Up_Problems.Codebix;

public class TrappedRainWater {


    public int trappedRainWater(int[] height) {
        int h = height.length;

        if (h == 1) return 0;

        int[] left = new int[h];

        left[0] = height[0];

        for (int i = 1; i < h; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[h];

        right[h - 1] = height[h - 1];

        for (int i = h - 2; i >= 0; i--) {

            right[i] = Math.max(right[i + 1], height[i]);
        }

        int water = 0;

        for (int i = 0; i < h; i++) {

            water = water + (Math.min(left[i], right[i]) - height[i]);
        }

        return water;
    }


    public static void main(String[] args) {

        int[] arr = {4, 2, 0, 3, 2, 5};
        TrappedRainWater trappedRainWater = new TrappedRainWater();
        System.out.println("Total trapped rain water is : " + trappedRainWater.trappedRainWater(arr));
    }
}

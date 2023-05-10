package Last_Minute_Brush_Up_Problems;

public class ContainerWithMostWater {


    public int containerWithMostWater(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {

            int area = Math.min(heights[left], heights[right]) * (right - left);

            maxArea = Math.max(area, maxArea);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }


    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println("Container with most water is :: " + containerWithMostWater.containerWithMostWater(arr));
    }
}

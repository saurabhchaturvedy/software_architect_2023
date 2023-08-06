package Last_Minute_Brush_Up_Problems.Codebix;

public class ContainerMostWater {




    public int containerWithMostWater(int[]arr)
    {

        int low = 0;
        int high = arr.length-1;

        int maxArea=0;

        while (low<high)
        {

            int currArea = Math.min(arr[low],arr[high])*(high-low);

            maxArea = Math.max(currArea,maxArea);

            if(arr[low]<arr[high])
            {
                low++;
            }
            else {
                high--;
            }
        }

        return maxArea;
    }


    public static void main(String[] args) {

        int[]arr = {1,8,6,2,5,4,8,3,7};

        ContainerMostWater containerMostWater = new ContainerMostWater();

        System.out.println("Container with most water is : "+containerMostWater.containerWithMostWater(arr));
    }
}

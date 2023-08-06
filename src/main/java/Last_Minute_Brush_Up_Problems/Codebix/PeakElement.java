package Last_Minute_Brush_Up_Problems.Codebix;

public class PeakElement {



    int peakElement(int[]arr)
    {
        int low = 0;
        int high = arr.length-1;

        while (low<high)
        {

            int mid = (low+high)>>>1;

            if(arr[mid]>arr[mid+1])
            {
                high = mid;
            }
            else {
                low = mid+1;
            }
        }

        return low;
    }


    public static void main(String[] args) {

        int[]arr = {1,2,1,3,5,6,4};
        PeakElement peakElement = new PeakElement();
        System.out.println("Peak element is : "+peakElement.peakElement(arr));
    }
}

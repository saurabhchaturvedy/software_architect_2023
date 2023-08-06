package Last_Minute_Brush_Up_Problems.Codebix;

public class FindMinimumRotatedSortedArray {




    public int findMinimumRotatedSortedArray(int[]arr)
    {

        int s = 0;
        int e = arr.length-1;

        while (s<e)
        {

            int m = (s+e)>>>1;

            if(arr[m]>arr[e])
            {
                s=m+1;
            } else if (arr[m]<arr[e]) {

                e=m;
            }
            else {
                e--;
            }
        }

        return arr[s];
    }


    public static void main(String[] args) {

        int[]arr = {4,5,6,7,8,9,1,2,3};

        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray();

        System.out.println("Minimum is : "+findMinimumRotatedSortedArray.findMinimumRotatedSortedArray(arr));
    }
}

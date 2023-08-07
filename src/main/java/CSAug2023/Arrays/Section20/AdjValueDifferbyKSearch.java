package CSAug2023.Arrays.Section20;

public class AdjValueDifferbyKSearch {




    public int differByKSearch(int[]arr,int val,int k)
    {
        if(arr.length==0)
        {
            return -1;
        }

        int start=0;

        while (start<arr.length)
        {

            if(arr[start]==val)
            {
                return start;
            }

            int diff = Math.abs(arr[start]-val)/k;
            start = start+diff;
        }

        return -1;
    }



    public static void main(String[] args) {
        int arr1[] = {70, 60, 70, 80, 90, 110, 130};
        AdjValueDifferbyKSearch adjValueDifferbyKSearch = new AdjValueDifferbyKSearch();

        System.out.println("search value index : "+adjValueDifferbyKSearch.differByKSearch(arr1,90,10));
    }
}

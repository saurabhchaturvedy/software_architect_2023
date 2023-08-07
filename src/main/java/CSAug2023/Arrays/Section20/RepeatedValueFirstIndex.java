package CSAug2023.Arrays.Section20;

import java.util.HashSet;
import java.util.Set;

public class RepeatedValueFirstIndex {



    public int repeatedFirstValueIndex(int[]arr)
    {
        if(arr.length==0)
        {
            return -1;
        }

        int first_index = -1;
        Set<Integer> set = new HashSet<>();

        for(int i=arr.length-1; i>=0; i--)
        {
            if(set.contains(arr[i])) {
                first_index = i;
            }
            else {
                set.add(arr[i]);
            }
        }

        return first_index;
    }


    public static void main(String[] args) {

        int[]arr = {1,2,3,5,6,7,5,8};
        RepeatedValueFirstIndex repeatedValueFirstIndex = new RepeatedValueFirstIndex();
        System.out.println("repeated value index is : "+repeatedValueFirstIndex.repeatedFirstValueIndex(arr));
    }
}

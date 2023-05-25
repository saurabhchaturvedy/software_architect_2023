package CodingSimplified.Array.Ten;

public class DeleteElementFromArray {

    int count = 5;

    public static void main(String[] args) {

        int[]arr = {10,15,18,22,29};
        DeleteElementFromArray deleteElementFromArray = new DeleteElementFromArray();
        deleteElementFromArray.print(arr);
        System.out.println();
        deleteElementFromArray.deleteElement(arr,18);
        deleteElementFromArray.print(arr);
    }



    public void deleteEnd(int[]arr)
    {
        if(arr.length==0)
            return;

        count--;
    }

    public void print(int[]arr)
    {

        for(int i=0; i<count-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public void deleteElement(int[]arr,int val)
    {
        int i=0;
        for(i=0; i<count-1; i++)
        {
            if(arr[i]==val)
            {
                break;
            }
        }

        if(i==count)
        {
            System.out.print(" Element is not in the array :: ");
            return;
        }

        for(int j=i; j>count-1; j--)
        {
            arr[j] = arr[j+1];
        }

        count--;
    }
}

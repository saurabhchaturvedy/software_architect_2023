package CSAug2023.Arrays.Section10;

public class ArrayDeletion {

    int count=5;


    public void deleteFromEnd(int[]arr)
    {
        if(arr.length==0)
            return;

        count--;
        return;
    }


    public void deleteElement(int[]arr,int val)
    {
      int i=0;
        for(i=0; i<count; i++)
        {
            if(arr[i]==val)
            {
                break;
            }
        }


        if(i==count)
        {
            System.out.println("No such element exists !!");
            throw new RuntimeException("Error element not found to delete !!");
        }


        for(int j=i; j<count; j++)
        {
            arr[j] = arr[j+1];
        }

        count--;
    }


    public void deleteFromPosition(int[]arr,int position)
    {
        if((position>count) || position<=0) return;

        for(int i=position-1; i<count; i++)
        {
            arr[i]=arr[i+1];
        }

        count--;
    }


    public void print(int[]arr)
    {
        for(int i=0; i<count; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};


        ArrayDeletion arrayDeletion = new ArrayDeletion();

        arrayDeletion.print(arr);
        System.out.println();
        arrayDeletion.deleteFromEnd(arr);

        arrayDeletion.print(arr);

        System.out.println();
        arrayDeletion.deleteElement(arr,3);

        arrayDeletion.print(arr);


        System.out.println();

        arrayDeletion.deleteFromPosition(arr,2);


        arrayDeletion.print(arr);
    }
}

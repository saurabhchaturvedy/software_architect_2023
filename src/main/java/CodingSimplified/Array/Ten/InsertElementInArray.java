package CodingSimplified.Array.Ten;

public class InsertElementInArray {


    int count = 0;

    public static void main(String[] args) {

        int[]arr = new int[5];
        InsertElementInArray insertElementInArray = new InsertElementInArray();

        for(int i=0; i< arr.length; i++)
        {
            insertElementInArray.insertLast(arr,i+1);
        }

        insertElementInArray.print(arr);

        insertElementInArray.insertStart(arr,67);

        System.out.println();

        insertElementInArray.print(arr);

        System.out.println();

        insertElementInArray.insertAtPosition(arr,33,3);

        insertElementInArray.print(arr);
    }


    public void insertLast(int[]arr,int val)
    {
        arr[count++] = val;
    }

    public void insertStart(int[]arr,int val)
    {

        for(int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = val;
    }

    public void insertAtPosition(int[]arr,int val,int position)
    {

        for(int i=arr.length-1; i>position-1; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[position-1] = val;

    }

    public void print(int[]arr)
    {

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

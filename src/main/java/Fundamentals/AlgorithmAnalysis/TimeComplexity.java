package Fundamentals.AlgorithmAnalysis;

public class TimeComplexity {



    private static int sumN(int n)
    {
        return n*(n+1)/2;
    }


    private static int sumNN(int n)
    {
        int sum=0;

        for(int i=1; i<=n; i++)
        {
            sum=sum+i;
        }

        return sum;
    }


    public static void main(String[] args) {


        long now = System.currentTimeMillis();
        System.out.println(sumNN(99999));
        System.out.println("Time taken : "+(System.currentTimeMillis()-now)+" ms");
    }
}

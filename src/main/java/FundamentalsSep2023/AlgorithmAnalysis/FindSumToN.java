package FundamentalsSep2023.AlgorithmAnalysis;

public class FindSumToN {


    int sumToN(int n) {
        return n * (n + 1) / 2;
    }


    int sumToNIterative(int n) {
        int sum = 0;

        for (int i = 1; i <= 1; i++) {
            sum = sum + i;
        }

        return sum;
    }


    public static void main(String[] args) {


        long now = System.currentTimeMillis();

        System.out.println("Calculating sum upto N");

        FindSumToN findSumToN = new FindSumToN();
        System.out.println("sum by formula is " + findSumToN.sumToN(99999));




        System.out.println("Elapsed time (formula) : " + (System.currentTimeMillis() - now) + " ms ");

        long now2 = System.currentTimeMillis();

        System.out.println("sum iterative is " + findSumToN.sumToN(99999));

        System.out.println("Elapsed time (iterative) : " + (System.currentTimeMillis() - now) + " ms ");
    }
}

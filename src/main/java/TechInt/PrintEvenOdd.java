package TechInt;

public class PrintEvenOdd {



    public static void main(String[] args){
        NumberPrinter printEvenOdd = new NumberPrinter(20);

        Thread evenThread = new Thread(() -> printEvenOdd.printEvenNumbers());
        Thread oddThread = new Thread(() -> printEvenOdd.printOddNumbers());

        evenThread.start();
        oddThread.start();
    }

}

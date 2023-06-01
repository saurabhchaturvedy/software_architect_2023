package Good_Solutions_Problems;

class PrintNumbers {
    private int maxNumber;
    private volatile int currentNumber;
    private Object lock = new Object();

    public PrintNumbers(int maxNumber) {
        this.maxNumber = maxNumber;
        this.currentNumber = 1;
    }

    public void printEven() {
        synchronized (lock) {
            while (currentNumber <= maxNumber) {
                if (currentNumber % 2 == 0) {
                    System.out.println("Even: " + currentNumber);
                    currentNumber++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (currentNumber <= maxNumber) {
                if (currentNumber % 2 != 0) {
                    System.out.println("Odd: " + currentNumber);
                    currentNumber++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers(10);

        Thread evenThread = new Thread(printNumbers::printEven);
        Thread oddThread = new Thread(printNumbers::printOdd);

        evenThread.start();
        oddThread.start();
    }
}

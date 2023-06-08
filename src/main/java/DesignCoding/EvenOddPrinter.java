package DesignCoding;

public class EvenOddPrinter {
    private static final int MAX_NUMBER = 10;
    private volatile int counter;
    private final Object lock = new Object();

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();
        Thread evenThread = new Thread(printer::printEvenNumbers);
        Thread oddThread = new Thread(printer::printOddNumbers);
        evenThread.start();
        oddThread.start();
    }

    public void printEvenNumbers() {
        while (counter < MAX_NUMBER) {
            synchronized (lock) {
                while (counter % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println("Even: " + counter);
                counter++;
                lock.notify();
            }
        }
    }

    public void printOddNumbers() {
        while (counter < MAX_NUMBER) {
            synchronized (lock) {
                while (counter % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                System.out.println("Odd: " + counter);
                counter++;
                lock.notify();
            }
        }
    }
}

package TechInt;

class NumberPrinter {
    private int currentNumber = 1;
    private final int maxNumber;


    public NumberPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void printEvenNumbers() {
        while (currentNumber <= maxNumber) {
            synchronized (this) {
                if (currentNumber % 2 == 0) {
                    System.out.println("Even: " + currentNumber);
                    currentNumber++;
                    this.notify(); // Notify the other thread waiting on the lock
                } else {
                    try {
                        this.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printOddNumbers() {
        while (currentNumber <= maxNumber) {
            synchronized (this) {
                if (currentNumber % 2 != 0) {
                    System.out.println("Odd: " + currentNumber);
                    currentNumber++;
                    this.notify(); // Notify the other thread waiting on the lock
                } else {
                    try {
                        this.wait(); // Wait for the other thread to notify
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
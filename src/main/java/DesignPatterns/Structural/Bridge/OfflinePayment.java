package DesignPatterns.Structural.Bridge;

class OfflinePayment extends Payment {
    public OfflinePayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Initiating offline payment...");
        paymentProcessor.processPayment(amount);
        System.out.println("Offline payment completed");
    }
}
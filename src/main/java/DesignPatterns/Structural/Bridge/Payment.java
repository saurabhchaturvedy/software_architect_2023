package DesignPatterns.Structural.Bridge;

abstract class Payment {
    protected PaymentProcessor paymentProcessor;

    public Payment(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public abstract void makePayment(double amount);
}
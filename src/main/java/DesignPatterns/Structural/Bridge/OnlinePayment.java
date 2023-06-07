package DesignPatterns.Structural.Bridge;

class OnlinePayment extends Payment {
    public OnlinePayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Initiating online payment...");
        paymentProcessor.processPayment(amount);
        System.out.println("Online payment completed");
    }
}
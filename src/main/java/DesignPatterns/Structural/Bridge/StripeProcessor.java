package DesignPatterns.Structural.Bridge;

class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe");
    }
}
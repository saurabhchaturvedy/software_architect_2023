package DesignPatterns.Structural.Facade;

class PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
        // Perform payment processing logic
    }
}
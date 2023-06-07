package DesignPatterns.Structural.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalProcessor();
        PaymentProcessor stripeProcessor = new StripeProcessor();

        Payment onlinePayment = new OnlinePayment(paypalProcessor);
        onlinePayment.makePayment(100.0);

        Payment offlinePayment = new OfflinePayment(stripeProcessor);
        offlinePayment.makePayment(50.0);
    }
}
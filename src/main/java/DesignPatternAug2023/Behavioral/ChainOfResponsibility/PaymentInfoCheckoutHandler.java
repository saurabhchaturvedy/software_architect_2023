package DesignPatternAug2023.Behavioral.ChainOfResponsibility;

public class PaymentInfoCheckoutHandler extends CheckoutHandler {
    @Override
    public void handleCheckout() {

        System.out.println(" Adding Payment Info : ");

        if (checkoutHandler != null) {
            checkoutHandler.handleCheckout();
        }
    }
}

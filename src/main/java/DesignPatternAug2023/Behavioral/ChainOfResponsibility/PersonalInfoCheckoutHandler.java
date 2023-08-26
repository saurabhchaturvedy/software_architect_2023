package DesignPatternAug2023.Behavioral.ChainOfResponsibility;

public class PersonalInfoCheckoutHandler extends CheckoutHandler {
    @Override
    public void handleCheckout() {
        System.out.println("Adding Personal Contact & Address Info :");

        if (checkoutHandler != null) {
            checkoutHandler.handleCheckout();
        }
    }
}

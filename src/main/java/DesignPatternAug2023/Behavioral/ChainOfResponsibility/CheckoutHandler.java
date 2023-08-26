package DesignPatternAug2023.Behavioral.ChainOfResponsibility;

public abstract class CheckoutHandler {

    protected CheckoutHandler checkoutHandler;

    public abstract void handleCheckout();

    public void setCheckoutHandler(CheckoutHandler checkoutHandler) {
        this.checkoutHandler = checkoutHandler;
    }
}

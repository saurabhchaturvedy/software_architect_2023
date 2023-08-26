package DesignPatternAug2023.Behavioral.ChainOfResponsibility;

public class DesignExecutor {


    public static void main(String[] args) {

        PersonalInfoCheckoutHandler personalInfoCheckoutHandler = new PersonalInfoCheckoutHandler();
        PaymentInfoCheckoutHandler paymentInfoCheckoutHandler = new PaymentInfoCheckoutHandler();

        personalInfoCheckoutHandler.setCheckoutHandler(paymentInfoCheckoutHandler);

        personalInfoCheckoutHandler.handleCheckout();
    }
}

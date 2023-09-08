package DesignPatternAug2023.Behavioral.Visitor;

public class PlatinumCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "Platinum card";
    }

    @Override
    public void accept(OfferVisitor v) {

        v.visitPlatinumCreditCard(this);
    }
}

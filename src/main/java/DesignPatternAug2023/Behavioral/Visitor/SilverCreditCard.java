package DesignPatternAug2023.Behavioral.Visitor;

public class SilverCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "Silver card";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitSilverCreditCard(this);
    }
}

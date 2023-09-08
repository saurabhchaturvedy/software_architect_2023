package DesignPatternAug2023.Behavioral.Visitor;

public class GoldCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "Gold card";
    }

    @Override
    public void accept(OfferVisitor v) {

        v.visitGoldCreditCard(this);
    }
}

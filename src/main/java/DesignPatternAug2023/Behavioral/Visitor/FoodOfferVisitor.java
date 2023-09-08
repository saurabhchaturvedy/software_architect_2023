package DesignPatternAug2023.Behavioral.Visitor;

public class FoodOfferVisitor implements OfferVisitor {
    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println(silverCreditCard.getName() + " : 10% discount on food");
    }

    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println(goldCreditCard.getName() + " : 20% discount on food");
    }

    @Override
    public void visitPlatinumCreditCard(PlatinumCreditCard platinumCreditCard) {
        System.out.println(platinumCreditCard.getName() + " : 30% discount on food");
    }
}

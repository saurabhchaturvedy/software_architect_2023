package DesignPatternAug2023.Behavioral.Visitor;

public class DesignExecutor {


    public static void main(String[] args) {

        OfferVisitor foodOfferVisitor = new FoodOfferVisitor();

        SilverCreditCard silverCreditCard = new SilverCreditCard();
        GoldCreditCard goldCreditCard = new GoldCreditCard();
        PlatinumCreditCard platinumCreditCard = new PlatinumCreditCard();

        foodOfferVisitor.visitSilverCreditCard(silverCreditCard);
        foodOfferVisitor.visitGoldCreditCard(goldCreditCard);
        foodOfferVisitor.visitPlatinumCreditCard(platinumCreditCard);
    }
}

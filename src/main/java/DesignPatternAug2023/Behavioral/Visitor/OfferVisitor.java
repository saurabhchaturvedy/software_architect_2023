package DesignPatternAug2023.Behavioral.Visitor;

public interface OfferVisitor {


    void visitSilverCreditCard(SilverCreditCard silverCreditCard);

    void visitGoldCreditCard(GoldCreditCard goldCreditCard);

    void visitPlatinumCreditCard(PlatinumCreditCard platinumCreditCard);
}

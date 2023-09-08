package DesignPatternAug2023.Behavioral.Visitor;

public interface CreditCard {


    String getName();

    void accept(OfferVisitor v);
}

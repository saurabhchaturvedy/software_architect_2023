package DesignPatternAug2023.Structural.Facade;

public class Bill {

    Integer amount;

    Bill(Integer amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount;
    }
}

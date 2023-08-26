package DesignPatternAug2023.Structural.Facade;

public class BillingSystem {


    Bill createBill(int amount) {
        return new Bill(amount);
    }
}

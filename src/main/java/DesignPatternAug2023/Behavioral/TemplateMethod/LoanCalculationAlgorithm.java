package DesignPatternAug2023.Behavioral.TemplateMethod;

public abstract class LoanCalculationAlgorithm {


    public int calculateLoanAmount() {

        return (int) (getAmount() * getInterest() - getDiscount());
    }

    public abstract int getAmount();

    public abstract double getInterest();

    public abstract int getDiscount();
}

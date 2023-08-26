package DesignPatternAug2023.Behavioral.TemplateMethod;

public class CheapLoan extends LoanCalculationAlgorithm{
    @Override
    public int getAmount() {
        return 50000;
    }

    @Override
    public double getInterest() {
        return 8.6;
    }

    @Override
    public int getDiscount() {
        return 20000;
    }
}

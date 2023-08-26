package DesignPatternAug2023.Behavioral.TemplateMethod;

public class DesignExecutor {


    public static void main(String[] args) {

        LoanCalculationAlgorithm cheapLoan = new CheapLoan();
        LoanCalculationAlgorithm expensiveLoan = new ExpensiveLoan();

        System.out.println("Cheap Loan Amount : " + cheapLoan.calculateLoanAmount());
        System.out.println("Expensive Loan Amount : " + expensiveLoan.calculateLoanAmount());
    }
}

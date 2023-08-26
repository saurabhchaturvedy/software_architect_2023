package DesignPatternAug2023.Structural.Facade;

public class CustomerInvoiceSystem {


    void createInvoiceForTheBill(Bill bill) {
        System.out.println("Invoice create for the bill : " + bill.getAmount());
    }
}

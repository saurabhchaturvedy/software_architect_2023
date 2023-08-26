package DesignPatternAug2023.Behavioral.Strategy;

public class ExcelDocCreationStrategy implements DocumentCreationStrategy {
    @Override
    public void createDocument() {
        System.out.println("Creating MS Excel Docs...");
    }
}

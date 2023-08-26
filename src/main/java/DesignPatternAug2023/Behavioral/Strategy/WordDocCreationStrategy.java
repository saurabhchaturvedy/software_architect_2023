package DesignPatternAug2023.Behavioral.Strategy;

public class WordDocCreationStrategy implements DocumentCreationStrategy {
    @Override
    public void createDocument() {
        System.out.println("Word doc created...");
    }
}

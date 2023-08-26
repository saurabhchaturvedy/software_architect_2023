package DesignPatternAug2023.Behavioral.Strategy;

public class PPTDocCreationStrategy implements DocumentCreationStrategy{
    @Override
    public void createDocument() {
        System.out.println("Creating PPT Docs...");
    }
}

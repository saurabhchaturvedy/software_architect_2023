package DesignPatternAug2023.Structural.Adapter;

public class DesignExecutor {


    public static void main(String[] args) {

        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter legacyRectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
        int rectangleValue = legacyRectangleAdapter.calculateSize();
        System.out.println("Rectangle value is = " + rectangleValue);
    }
}

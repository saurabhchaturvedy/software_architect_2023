package DesignPatternAug2023.Structural.Adapter;

public class LegacyRectangleAdapter extends Rectangle {


    LegacyRectangle legacyRectangle;


    LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public int calculateSize() {
        return legacyRectangle.getSize();
    }
}

package DesignPatternAug2023.Structural.Bridge;

public class DirectXWindowImpl extends WindowImpl{
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing graphic on DirectX : " + x + " y: " + y + " width : " + width + " height " + height + " Color :" + color);
    }
}

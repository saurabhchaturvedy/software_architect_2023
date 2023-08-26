package DesignPatternAug2023.Structural.Bridge;

public class LinuxWindowImpl extends WindowImpl {
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing graphic on Linux : " + x + " y: " + y + " width : " + width + " height " + height + " Color :" + color);
    }
}

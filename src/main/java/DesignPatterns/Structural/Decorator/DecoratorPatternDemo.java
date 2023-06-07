package DesignPatterns.Structural.Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Room basicRoom = new BasicRoom();
        System.out.println("Basic Room: " + basicRoom.furnish());

        Room fancyRoom = new FancyDecorator(basicRoom);
        System.out.println("Fancy Room: " + fancyRoom.furnish());

        Room deluxeRoom = new PaintedDecorator(new FancyDecorator(basicRoom));
        System.out.println("Deluxe Room: " + deluxeRoom.furnish());
    }
}
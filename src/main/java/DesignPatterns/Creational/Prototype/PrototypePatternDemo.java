package DesignPatterns.Creational.Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create and clone cars from the registry
        Car clonedSedan = CarRegistry.getCar("Sedan");
        Car clonedSUV = CarRegistry.getCar("SUV");

        // Use the cloned cars
        if (clonedSedan != null && clonedSUV != null) {
            clonedSedan.start();
            clonedSUV.start();
        }
    }
}
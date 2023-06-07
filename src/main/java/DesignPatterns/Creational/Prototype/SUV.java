package DesignPatterns.Creational.Prototype;

class SUV implements Car {
    public void start() {
        System.out.println("SUV car started.");
    }

    public Car clone() {
        return new SUV();
    }
}
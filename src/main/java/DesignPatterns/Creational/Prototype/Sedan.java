package DesignPatterns.Creational.Prototype;

class Sedan implements Car {
    public void start() {
        System.out.println("Sedan car started.");
    }

    public Car clone() {
        return new Sedan();
    }
}
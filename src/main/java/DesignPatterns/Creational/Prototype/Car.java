package DesignPatterns.Creational.Prototype;

interface Car extends Cloneable {
    void start();
    Car clone();
}
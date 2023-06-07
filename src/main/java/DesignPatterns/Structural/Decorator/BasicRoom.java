package DesignPatterns.Structural.Decorator;

class BasicRoom implements Room {
    @Override
    public String furnish() {
        return "Basic Room";
    }
}
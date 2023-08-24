package DesignPatternAug2023.FactoryMethod;

public class CarFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Car();
    }
}

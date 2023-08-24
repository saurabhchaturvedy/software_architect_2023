package DesignPatternAug2023.FactoryMethod;

public class TruckFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Truck();
    }
}

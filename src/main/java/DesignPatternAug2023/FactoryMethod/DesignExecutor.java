package DesignPatternAug2023.FactoryMethod;

public class DesignExecutor {


    public static void main(String[] args) {

        TransportFactory transportFactory = new CarFactory();

        Transport transport = transportFactory.create();

        System.out.println(transport.drive());


        transportFactory = new TruckFactory();

        transport = transportFactory.create();

        System.out.println(transport.drive());
    }
}

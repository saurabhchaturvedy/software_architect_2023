package DesignPatternAug2023.Creational.Singleton;

public class EagerSingleton {


    private static final EagerSingleton eagerSingleton = new EagerSingleton();


    private EagerSingleton() {
    }


    public EagerSingleton getInstance() {
        return eagerSingleton;
    }
}

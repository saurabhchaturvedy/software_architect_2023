package DesignPatternAug2023.Creational.Singleton;

public class LazySingleton {


    private static LazySingleton lazySingleton;


    private LazySingleton() {

    }


    public LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}

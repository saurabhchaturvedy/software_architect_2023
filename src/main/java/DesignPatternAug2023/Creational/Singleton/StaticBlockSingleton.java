package DesignPatternAug2023.Creational.Singleton;

public class StaticBlockSingleton {


    private static StaticBlockSingleton staticBlockSingleton;


    private StaticBlockSingleton() {

    }


    static {

        try {
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (RuntimeException e) {
            System.out.println("Instatiation of the singleton failed...");
        }
    }


    public StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }
}

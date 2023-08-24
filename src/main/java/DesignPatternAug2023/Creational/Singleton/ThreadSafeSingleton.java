package DesignPatternAug2023.Creational.Singleton;

public class ThreadSafeSingleton {


    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {

    }


    public synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }

        return threadSafeSingleton;
    }


    public synchronized ThreadSafeSingleton getDoubleCheckInstance() {
        if (threadSafeSingleton == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }

        return threadSafeSingleton;
    }
}

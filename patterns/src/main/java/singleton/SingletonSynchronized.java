package main.java.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized instance = null;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
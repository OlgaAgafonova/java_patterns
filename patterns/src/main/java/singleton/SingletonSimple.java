package main.java.singleton;

public final class SingletonSimple {

    private static SingletonSimple instance = null;

    private SingletonSimple() {
    }

    public static synchronized SingletonSimple getInstance() {
        if (instance == null) {
            instance = new SingletonSimple();
        }
        return instance;
    }
}

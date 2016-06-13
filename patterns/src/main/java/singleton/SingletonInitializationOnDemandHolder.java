package main.java.singleton;

public final class SingletonInitializationOnDemandHolder {
    private SingletonInitializationOnDemandHolder() {
    }

    private static class SingletonHolder {
        private final static SingletonInitializationOnDemandHolder instance = new SingletonInitializationOnDemandHolder();
    }

    public static SingletonInitializationOnDemandHolder getInstance() {
        return SingletonHolder.instance;
    }
}
package main.java.singleton;

public final class SingletonSimpleModified {
    private static final SingletonSimpleModified instance = new SingletonSimpleModified();

    private SingletonSimpleModified() {
    }

    public static synchronized SingletonSimpleModified getInstance() {
        return instance;
    }
}
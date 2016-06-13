package main.java.singleton;

public final class SingletonBlockStatic {
    private static SingletonBlockStatic instance;

    private SingletonBlockStatic() {
    }

    //блок статической инициализации с возможностью обработки исключительных ситуаций
    static {
        try {
            instance = new SingletonBlockStatic();
        } catch (Exception e) {
            throw new RuntimeException("ERROR : creating a «Singleton» object");
        }
    }

    public static SingletonBlockStatic getInstance() {
        return instance;
    }
}
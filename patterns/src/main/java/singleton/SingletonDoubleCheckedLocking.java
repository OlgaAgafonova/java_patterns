package main.java.singleton;

public final class SingletonDoubleCheckedLocking {
    private static volatile SingletonDoubleCheckedLocking instance = null;

    private SingletonDoubleCheckedLocking() {
    }

    public static synchronized SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) instance = new SingletonDoubleCheckedLocking();
            }
        }
        return instance;
    }
}
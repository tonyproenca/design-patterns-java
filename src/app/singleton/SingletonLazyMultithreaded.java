package app.singleton;

import static java.util.Objects.isNull;

/**
 * SingletonLazyMultithreaded
 */
public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded sc = null;

    private SingletonLazyMultithreaded() {
    }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        if (isNull(null)) {
            sc = new SingletonLazyMultithreaded();
        }
        return sc;
    }
}
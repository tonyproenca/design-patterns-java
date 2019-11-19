package app.singleton;

import static java.util.Objects.isNull;

/**
 * SingletonLazy This is a complete singleton, with unique instance assurement
 */
public class SingletonLazy {

    private static SingletonLazy sc = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (isNull(sc)) {
            sc = new SingletonLazy();
        }

        return sc;
    }
}
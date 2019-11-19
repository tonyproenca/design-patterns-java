package app.singleton;

import static java.util.Objects.isNull;

/**
 * SingletonLazyDoubleCheck
 */
public class SingletonLazyDoubleCheck {

    private volatile static SingletonLazyDoubleCheck sc = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (isNull(sc)) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null) {
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }

        return sc;
    }
}
package app.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Objects;

/**
 * Singleton
 */
public class Singleton implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1093810940935189395L;

    private static Singleton sc = new Singleton();

    private Singleton() {
        if (Objects.nonNull(sc)) {
            throw new IllegalStateException("Singleton Already created!");
        }
    }

    public static Singleton getInstance() {
        return sc;
    }

    public Object readResolve() throws ObjectStreamException {
        return sc;
    }

    public Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot me cloned!");
    }

    
    /*
        To prevent the singleton getting instantiated from different class loaders, you can implement the getClass() method. The
        above getClass() method associates the classloader with the current thread; if that classloader is null, the method uses the
        same classloader that loaded the singleton class.
    */

    @SuppressWarnings({"unused", "final"})
    private static Class getClass(  String className) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (Objects.isNull(classLoader)) {
            classLoader = Singleton.class.getClassLoader();
        }

        return (classLoader.loadClass(className));
    }

}
package one.digitalinnovation.gof;

/*
 * Singleton "Lazy Holder"
 * @see <a href="https://stackoverflow.com/a/2418148">Referencia</a>
 * @author matheus-brendo
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
    public   static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static  SingletonLazyHolder getIntancia() {

        return InstanceHolder.instancia;
    }
}

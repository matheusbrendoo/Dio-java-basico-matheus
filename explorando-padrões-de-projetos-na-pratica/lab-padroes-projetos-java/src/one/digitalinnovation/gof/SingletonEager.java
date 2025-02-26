package one.digitalinnovation.gof;

/*
 * Singleton "apressado"
 * @author matheus-brendo
 */
public class SingletonEager {

    private  static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static  SingletonEager getIntancia() {
        return instancia;
    }
}

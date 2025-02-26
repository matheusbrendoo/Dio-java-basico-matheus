import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //testes relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);

        eager = SingletonEager.getIntancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getIntancia();
        System.out.println(lazyHolder);


    }
}
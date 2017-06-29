package singletone;

/**
 * Created by Вадим on 06.05.2017.
 */
public class Singleton {

    private Singleton(){}

    private static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton ==null){
            singleton = new Singleton();
        }

        return singleton;

    }
}

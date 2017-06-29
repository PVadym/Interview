package inher;

/**
 * Created by Вадим on 18.06.2017.
 */
public class Basic {

    public void firstMethod(){
        System.out.println("first method Basic");
    }

    public void secondMethod(){
        System.out.println("second method Basic");
        firstMethod();
    }
}

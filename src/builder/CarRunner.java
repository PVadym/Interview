package builder;

/**
 * Created by Вадим on 08.06.2017.
 */
public class CarRunner {

    public static void main(String[] args) {


        Director director = new Director();
        director.setBuilder(new ZazBuilder());
        Car car  = director.buildCar();
        System.out.println(car);

        director.setBuilder(new KiaBuilder());
        car = director.buildCar();
        System.out.println(car);
    }

}

package builder;

/**
 * Created by Вадим on 08.06.2017.
 */
public class Director {

    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }


    public Car buildCar(){
        builder.createCar();
        builder.buildEngine();
        builder.buildTyres();
        builder.buildColor();
        builder.buildSpeed();
        return builder.getCar();
    }
}

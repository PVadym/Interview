package builder;

/**
 * Created by Вадим on 06.05.2017.
 */
public abstract class Builder {

    Car car;

    public void createCar(){
        car = new Car();
    }

    abstract void buildEngine();
    abstract void buildTyres();
    abstract void buildColor();
    abstract void buildSpeed();

    public Car getCar() {
        return this.car;
    }
}

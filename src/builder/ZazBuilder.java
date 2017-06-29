package builder;

/**
 * Created by Вадим on 08.06.2017.
 */
public class ZazBuilder extends Builder {



    @Override
    void buildEngine() {
        this.car.setEngine("1.5 Chery");
    }

    @Override
    void buildTyres() {
        this.car.setTyres("Rossava");
    }

    @Override
    void buildColor() {
        this.car.setColor("red");
    }

    @Override
    void buildSpeed() {
        this.car.setSpeed(150);

    }
}

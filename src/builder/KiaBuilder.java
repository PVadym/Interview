package builder;

/**
 * Created by Вадим on 08.06.2017.
 */
public class KiaBuilder extends Builder {


    @Override
    void buildEngine() {
        this.car.setEngine("1.7U");
    }

    @Override
    void buildTyres() {
        this.car.setTyres("Henkook");
    }

    @Override
    void buildColor() {
        this.car.setColor("black");
    }

    @Override
    void buildSpeed() {
        this.car.setSpeed(220);

    }
}

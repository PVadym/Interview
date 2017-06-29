package builder;

/**
 * Created by Вадим on 08.06.2017.
 */
public class Car {

    private String engine;
    private String tyres;
    private String color;
    private int speed;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", tyres='" + tyres + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

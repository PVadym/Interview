package AngleClock;

/**
 * Created by Вадим on 07.06.2017.
 */
public class ClockAngle {

    public static void main(String[] args) {
        System.out.println(getAngle(3,15));

    }

    static int getAngle(int hour, int minutes){
//        int minutesAngle = minutes*360/60;
//        System.out.println(minutesAngle);
//        int hourAngle = hour*360/12 + minutes/12;
//        System.out.println(hourAngle);
        return 30*(hour + minutes/60) - minutes*6;// - minutesAngle;
    }
}

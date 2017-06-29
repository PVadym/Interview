package polindrom;

import java.util.Scanner;

/**
 * Created by Вадим on 27.05.2017.
 */
public class Polindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
       // int i = 678919876;
        System.out.println(isPolindrom(i));
    }

    public static boolean isPolindrom(double a){
        boolean result = false;
        String string = String.valueOf(a);
        char [] array = string.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (array[i]==array[array.length-1-i]){
                result = true;
            }
        }
        return result;
    }
}

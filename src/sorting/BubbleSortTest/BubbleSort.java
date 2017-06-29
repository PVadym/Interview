package sorting.BubbleSortTest;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Вадим on 27.05.2017.
 */
public class BubbleSort {

    public static void main(String[] args) {
        Random random = new Random();

        int [] arrayToSort = new int [10];
        for (int i = 0; i < 10; i++){
            arrayToSort[i] = random.nextInt(100);
        }

        String [] strings = {"gfsgg", "as", "ktr", "zxc", "bcd"};
        System.out.println(Arrays.toString(arrayToSort));
        sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sort(strings)));
        System.out.println(Arrays.toString(strings));
        System.out.println("gfsgg".compareTo("as"));

    }

    public static int [] sort( int [] array){
        for(int i = array.length-1; i > 1; i--){
            for (int j = 0; j < i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static String [] sort( String [] array){
        for (int i = array.length - 1; i >=0; i--){
            for (int j = 0; j < i; j++){
                if(array[j].compareTo(array[j+1])>0){
                    String temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}

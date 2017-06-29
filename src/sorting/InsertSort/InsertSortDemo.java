package sorting.InsertSort;

import java.util.Random;

/**
 * Created by Вадим on 10.06.2017.
 */
public class InsertSortDemo {

    public static void main(String[] args) {

        int [] arrayToSort = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayToSort.length; i++){
            arrayToSort[i] = random.nextInt(100);
        }
        print(arrayToSort);
        insertSort(arrayToSort);
        print(arrayToSort);



    }

    public static void print(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertSort(int [] a){
        for (int i = 1; i < a.length; i++){
            int valueSort = a[i];
            int j = i;
            while(j > 0 && a[j-1]>valueSort){
                a[j] = a [j-1];
                j--;
            }
            a[j] = valueSort;
        }
    }
}

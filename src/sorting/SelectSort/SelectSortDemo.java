package sorting.SelectSort;

import java.util.Random;

/**
 * Created by Вадим on 06.06.2017.
 */
public class SelectSortDemo {

    public static void main(String[] args) {

        int [] arrayToSort = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayToSort.length; i++){
            arrayToSort[i] = random.nextInt(100);
        }
        print(arrayToSort);
        selectSort(arrayToSort);
        print(arrayToSort);
        bubbleSort(arrayToSort);
        print(arrayToSort);
        System.out.println(bynarySearch(arrayToSort, 10));


    }

    public static void print(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectSort(int [] array){
        int min;
        for (int i = 0; i < array.length; i++){
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
                    int tmp = array[min];
                    array[min] = array [i];
                    array [i] = tmp;
        }
    }

    public static void bubbleSort(int [] array){
        for (int i = array.length-1; i > 1; i--){
            for(int j = 0; j < i; j ++){
                if (array[j]>array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                }
            }
        }
    }

    public static int bynarySearch(int a [], int search){
        int upper = a.length-1;
        int low = 0;
        int cur;

        while (true){
            cur = (upper+low)/2;
            if (a[cur] == search){
                return cur;
            } else
            if (low > upper){
                return a.length;
            } else if (search > a[cur]){
                low = cur + 1;
            } else {
                upper = cur - 1;
            }
        }
    }
}

package other;

import java.util.Random;

/**
 * Created by Вадим on 07.06.2017.
 */
public class Main {




    public static void main(String[] args) {

        int []a = new int [10];
        initArray(a);
        print(a);
        insertSort(a);
        print(a);

    }

    static void bubbleSort(int [] a){
        for (int i = a.length-1; i >1; i--){
            for (int j = 0; j < i; j++){
                if (a[j] > a[j+1]) {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    static void selectSort(int [] a){
        int min;
        for (int i = 0; i < a.length; i++){
            min = i;
            for (int j =i+1; j < a.length; j++){
                if (a[j]< a[min]){
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }

    static void insertSort(int [] a){
        int i,j;
        for (i = 1; i < a.length; i++){
            int tmp = a[i];
            j=i;
            while (j>0&&a[j-1]>tmp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = tmp;
        }
    }

    static void initArray(int [] a){

        Random random = new Random();
        for (int i = 0; i< a.length; i++){
            a[i] = random.nextInt(100);
        }

    }

    static void print(int [] a){
        for (int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}



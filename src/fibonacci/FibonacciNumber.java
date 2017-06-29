package fibonacci;

/**
 * Created by Вадим on 27.05.2017.
 */
public class FibonacciNumber {

    public static void main(String[] args) {

        System.out.println(fibonacciArray(11));
        System.out.println(fibonacciRec(11));
        System.out.println(fibonacciCycle(11));
        // 1 1 2 3 5 8 13 21 34 55 89
    }

    private static int fibonacciRec(int n) {
        if(n == 1||n == 2){
            return 1;
        } else{

            return fibonacciRec(n-1) + fibonacciRec(n-2);
        }

    }

    private static int fibonacciArray(int n){
        if(n == 1||n == 2) {
            return 1;
        } else {
            int [] array = new int[n];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < array.length; i++){
                array[i] = array[i-1]+array[i-2];
            }
            return array[array.length-1];
        }
    }

    private  static int fibonacciCycle(int n){
        if(n == 1||n == 2){
            return 1;
        } else{
            int first = 1;
            int second = 1;
            int fibo = 0;

            for (int i = 2; i < n; i++){
                fibo = first+second;
                first = second;
                second = fibo;
            }
            return fibo;
        }
    }

}

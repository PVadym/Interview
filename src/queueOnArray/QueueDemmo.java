package queueOnArray;

import java.util.Random;

/**
 * Created by Вадим on 10.06.2017.
 */
public class QueueDemmo {

    public static void main(String[] args) {

        Queue queue = new Queue(10);
        Random random = new Random();

        for (int i = 0; i <15; i++){
            int value = random.nextInt(100);
            System.out.print(value + " ");
            queue.insert(value);
        }
        System.out.println();

        for (int i = 0; i <10; i++){
            System.out.print(queue.remove() +" ");
        }

    }
}

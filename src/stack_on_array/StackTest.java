package stack_on_array;

import java.util.Random;

/**
 * Created by Вадим on 09.06.2017.
 */
public class StackTest {

    public static void main(String[] args) {

        Stack stack = new Stack(10);
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());

        Random random = new Random();

        while (!stack.isFull()){
            stack.push(random.nextInt(100));
            System.out.println(stack.peek());
        }
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.poll());
        }
        stack.poll();

        System.out.println(stack.isEmpty());


    }
}

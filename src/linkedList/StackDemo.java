package linkedList;

/**
 * Created by Вадим on 13.06.2017.
 */
public class StackDemo {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(4);
        myStack.push(5);
        myStack.push(8);
        myStack.push(7);
        myStack.push(9);

        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());

        while(myStack.size()!=0){
            System.out.print(myStack.poll() + ";");
        }
    }
}

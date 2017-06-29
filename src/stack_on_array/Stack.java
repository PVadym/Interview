package stack_on_array;

/**
 * Created by Вадим on 09.06.2017.
 */
public class Stack {

    private int size;
    private int [] array;
    private int index;

    public Stack(int size) {
        array = new int [size];
        index = -1;
    }

    public void push(int value) {
        if (!isFull()) {
            index++;
            array[index] = value;
        } else
            System.out.println("Stack is full!");
    }

    public int poll(){
        if(!isEmpty()){
            int value = array[index];
            index--;
            return value;
        } throw new RuntimeException("Stack is empty");
    }

    public int peek(){
        return array[index];
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        return (index==-1);
    }

    public boolean isFull(){
        return (index==array.length-1);
    }

}

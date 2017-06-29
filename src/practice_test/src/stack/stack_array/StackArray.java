package practice_test.src.stack.stack_array;

/**
 * Created by Вадим on 22.04.2017.
 */
public class StackArray {

    private int [] array;
    private int index;

    public StackArray(int n) {
        this.array = new int [n];
        this.index = 0;
    }

    public void push (int i){
        if(index == array.length){
            System.out.println("Stack is full!");
        } else {
            array[index] = i;
            index++;
        }
    }

    public int peek(){
        if (index == 0){
            throw  new RuntimeException("Stack is empty!");
        } else {
            int value = array[index-1];
            index--;
            return value;
        }
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(20);
        stackArray.push(1);
        stackArray.push(5);
        stackArray.push(5);
        stackArray.push(5);
        stackArray.push(5);
        stackArray.push(8);
        stackArray.push(1);
        stackArray.push(5);
        stackArray.push(3);
        stackArray.push(8);
        stackArray.push(8);
        stackArray.push(8);
        stackArray.push(8);
        stackArray.push(8);
        for( int i = 0; i < 11; i++ ) {
            System.out.println(stackArray.peek());
        }
        System.out.println(stackArray.index);
    }

}

package practice_test.src.stack.stack_array_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадим on 22.04.2017.
 */
public class StackArrayList <T>{

    private List<T> list = new ArrayList<T>();

    public void push(T t){
        list.add(t);
    }

    public T pop(){
        if(list.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        } else {
            return list.remove(list.size()-1);
        }
    }

    public T peek(){
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {

        StackArrayList<Double> doubleStackArrayList = new StackArrayList<>();
        doubleStackArrayList.push(5.5);
        doubleStackArrayList.push(2.5);
        doubleStackArrayList.push(3.0);
        doubleStackArrayList.push(5.8);
        System.out.println(doubleStackArrayList.peek());
        for(int i = 0; i <10; i++) {
            System.out.println(doubleStackArrayList.pop());
        }

    }
}

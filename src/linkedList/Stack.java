package linkedList;

import java.util.LinkedList;

/**
 * Created by Вадим on 13.06.2017.
 */
public class Stack {

    private LikedList list;
    private int size;

    public Stack() {
        this.list = new LikedList();
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public void push(int value) {
        list.insertFirst(value);
        size++;
    }

    public int poll(){
        size--;
        return list.removeFirst();
    }

    public int peek(){
        return list.head.value;
    }
}

package queueOnArray;

/**
 * Created by Вадим on 10.06.2017.
 */
public class Queue {

    private int maxSize;
    private int [] array;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.array = new int [maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value){
//        if (rear == maxSize-1){
//            rear =-1;
//        }
        rear++;
        array[rear] = value;
        nItems++;
    }

    public int remove(){
        int tmp = array[front];
        front++;
//        if (front == maxSize){
//            front = 0;
//        }
        nItems--;
        return tmp;
    }

    public int peekFront(){
        return array[front];
    }

    public int size(){
        return nItems;
    }


}

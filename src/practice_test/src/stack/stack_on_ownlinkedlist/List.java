package practice_test.src.stack.stack_on_ownlinkedlist;

/**
 * Created by Вадим on 24.02.2017.
 */

//http://axis.bplaced.net/news/773
public class List<T> {

    private Node head;

    public void pull(T data){
        Node element = new Node();
        element.data = data;
        if(head == null){
            head = element;
        } else {
            element.next=head;
            head = element;
        }
    }

    public Node peek(){
        if(head == null) {
            System.out.println("Stack is empty!");
            return null;
        }

        Node t = head;
        head = head.next;
        return t;
    }

    public void print(){
        Node t = head;
        while (t!=null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}

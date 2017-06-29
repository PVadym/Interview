package linkedList;

/**
 * Created by Вадим on 13.06.2017.
 */
public class LikedList {

    Link head;

    public void insertFirst(int data){

        Link newLink = new Link(data);
        if (head==null){
            head = newLink;
        } else {
            newLink.next = head;
            head = newLink;
        }
    }

    public int removeFirst(){

        Link link = head;
        head = head.next;
        return link.value;

    }

    public void print(){
        Link current = head;
        while (current!=null){
            System.out.print("Data = " + current.value + " ");
            current = current.next;
        }
    }

    public boolean find(int search){
        Link current = head;
        while (current!=null){
            if (current.value == search){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

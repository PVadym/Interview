package linkedList;

/**
 * Created by Вадим on 13.06.2017.
 */
public class LinkedListTest {

    public static void main(String[] args) {

        LikedList likedList = new LikedList();
        likedList.insertFirst(5);
        likedList.insertFirst(8);
        likedList.insertFirst(4);
        likedList.insertFirst(1);
        likedList.insertFirst(2);
        likedList.print();
        System.out.println();
        System.out.println(likedList.find(2));
        System.out.println(likedList.removeFirst());
        System.out.println(likedList.find(2));
       // System.out.println(likedList.removeFirst());
        likedList.print();

    }
}

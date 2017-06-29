package bynary_tree;

/**
 * Created by Вадим on 28.06.2017.
 */
public class TreeDemo {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(50);
        tree.insert(2);
        tree.insert(51);
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(40);
        tree.insert(56);
        tree.insert(5);


        tree.inOrder();
        System.out.println("==========================");
        tree.preOrder();
        System.out.println("==========================");
        tree.postOrder();

        System.out.println("find =" + tree.find(525));
    }
}

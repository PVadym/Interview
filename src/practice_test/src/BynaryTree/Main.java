package practice_test.src.BynaryTree;

/**
 * Created by Вадим on 02.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert("1");
        tree.insert("2");
        tree.insert("8");
        tree.insert("6");
        tree.insert("3");
        tree.insert("0");
        tree.insert("4");

       // tree.getAll();
        tree.print();
    }
}

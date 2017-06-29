package practice_test.src.array_list;

/**
 * Created by Вадим on 08.05.2017.
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList(2);
        System.out.println(arraylist.add(1));
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        System.out.println("Lebngth of list = " + arraylist.index);

        arraylist.printAll();

    }
}

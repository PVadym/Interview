package practice_test.src.array_list;

/**
 * Created by Вадим on 08.05.2017.
 */
public class ArrayList {

    private int array [];
    public int index = 0;

    public ArrayList(int n) {
        this.array = new int [n];


    }


    public int add(int value){
        if (index==array.length){
            int arrayNew [] = new int [array.length*2];
            for (int i = 0; i< array.length; i++ ){
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }
            array[index] = value;
        index++;
        return value;
    }

    public void printAll(){
        for (int anArray : array) {
            System.out.println(anArray);
        }

    }
}

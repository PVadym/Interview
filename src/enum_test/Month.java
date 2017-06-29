package enum_test;

/**
 * Created by Вадим on 27.04.2017.
 */
public enum Month {


    JANUARY(1){
        @Override
        void print() {
            System.out.println(JANUARY.name());
        }
    }, FEBRUARY(8){
        @Override
        void print() {

        }
    }, MARCH(3) {
        @Override
        void print() {

        }
    };
    private int i;

    private Month(int i) {
        this.i = i;
    }

    void printArgs(){
        System.out.println(i);
    }
    static Month getByString(String s){
        if (s!=null&&!s.isEmpty()){
            return valueOf(s);
        }
        throw new RuntimeException("Enum with name " + s + " does not exist ");
    }
    abstract void print();
    public static void main(String[] args) {
        System.out.println(Month.FEBRUARY.compareTo(MARCH));
        Month month = Month.valueOf("march".toUpperCase());
        System.out.println(FEBRUARY);

        FEBRUARY.printArgs();


        getByString("january").printArgs();
        // System.out.println(Month.values());
    }
}

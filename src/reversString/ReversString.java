package reversString;

/**
 * Created by Вадим on 02.06.2017.
 */
public class ReversString {

    public static void main(String[] args) {
        System.out.println(reversArray("Hello"));
        System.out.println(reversBuilder("Hello"));
    }

    private static String reversBuilder(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    private static String reversArray(String string) {
        String result = "";
        char [] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += chars[chars.length-1-i];
        }
        return result;
    }


}

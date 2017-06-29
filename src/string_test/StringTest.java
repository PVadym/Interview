package string_test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Вадим on 10.05.2017.
 */
public class StringTest {

    // String aaabcaaabc

    //  6 a;
    // 2 b;
    // 2 c;

    public static void main(String[] args) {
        for (Map.Entry<Character, Integer> pair : findLetters("aaabcaaabc").entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }


    public static Map<Character, Integer> findLetters(String string){
        Map<Character, Integer> map = new HashMap<>();
        char [] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++){
            int count =0;
            for (int j = 0; j <chars.length; j++){

                if (chars[i]==chars[j]){
                    count++;
                }
            }
            map.put(chars[i],count);
        }
        return map;
    }
}

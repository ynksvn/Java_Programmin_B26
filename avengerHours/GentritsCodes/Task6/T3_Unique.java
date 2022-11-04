package GentritsCodes.Task6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class T3_Unique {
    //   3.)  Map - Unique character from String

    public static void unique(String str) {
        LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
        char[] charArray = str.toCharArray();
        for (char character : charArray) {
            if (list.get(character) == null) {
                list.put(character, 1);
            } else {
                list.put(character, list.get(character) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : list.entrySet())
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey());
                break;
            }
    }

    public static void main(String[] args) {

    unique("aaabcccddeggf");
}
 }
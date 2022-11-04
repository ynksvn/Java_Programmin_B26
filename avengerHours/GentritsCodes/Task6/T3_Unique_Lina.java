package GentritsCodes.Task6;

import java.util.HashMap;
import java.util.Map;

public class T3_Unique_Lina {
    public static String uniqueLetters (String str) {
        String unique = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {//"AAABBCDDF"
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1); //A , 3 //if the map already has the key, i will add 1 to the value, because it doesnt include the first one
            } else {
                map.put(str.charAt(i), 1); //A, 3    B, 2    C, 1   D, 2    F, 1
            } //if map doesnt contain the key, i will assign one as my value of the key

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) { //iterate through the map that i created already
            if (entry.getValue() == 1) {  //to check the each keys value
                unique += entry.getKey();
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        String str = "AAABBCDDF";
        System.out.println(uniqueLetters(str));
    }
}

package GentritsCodes.Task6;

import java.util.LinkedHashMap;
import java.util.Map;

public class T2_FrequencyPractice {
     /*
    Given a String count how many times each character is in the String
     */
     public static void main(String[] args) {
         frequencyOfEachChar("banana");
     }
    public static void frequencyOfEachChar(String str){


        Map<Character, Integer> counter = new LinkedHashMap <>();
        //key will be the character, value will be number
        for (int i = 0; i<str.length();i++){

            char key = str.charAt(i); //instead of calling this many times

            if (counter.containsKey(key)){ // counter is our map. this will look every single character.
                //this is a duplicate letter, it is found before. we will need to update the counter for it, which is the value in our map

                counter.put(key, counter.get(key)+1); //counter.get() is the method from the map to get the value of the previous counter, then we add 1 to that number, then assigns that result as the new value linked to that key
                        }else{
                //the map does not contain the letter/char -> which means this is the first time the character was found, so we should add it to the map
                counter.put(key,1);
            }

    }

        System.out.println(counter);
    }

}

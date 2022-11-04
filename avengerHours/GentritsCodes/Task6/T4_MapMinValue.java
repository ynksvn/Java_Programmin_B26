package GentritsCodes.Task6;

import java.util.HashMap;
import java.util.Map;

public class T4_MapMinValue {
    //4.)  Map - Min value
    //Write a method that can return the minimum value from ta map (DO NOT use sort method)


    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("James", 70);
        ages.put("Jane", 30);
        ages.put("Ana", 14);
        ages.put("Jorge", 42);
        ages.put("Peter", 23);


        String oldest = "";
        int min = Integer.MAX_VALUE;
        // We can't declare 0, because 0 is the smallest number. Integer.Max_Value gives us the biggest number on integer

        String youngest= "";
        int max =0;

        //Use the created map to find the following:
        for (String key : ages.keySet()) { // iterate through the keys
            int value = ages.get(key); //we use get method to read the values by the key

            //    1.1 who has the maximum age in the group?
            if (value > max) {
                oldest = key;
                max = value;
            }
//    1.2 who has the minimum age in the group?
            if (value < min) {
                youngest = key;
                min = value;
            }
        }
        System.out.println("Max: " + oldest + " " + max);
        System.out.println("Min: " + youngest + " " + min);

    }
}
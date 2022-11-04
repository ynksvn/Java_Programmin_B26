package GentritsCodes.Task6;

import java.util.*;

public class T2_FrequencyOfEachCharacter {
    //   2.)  Map - Frequency of Characters
    //    Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {


        /*
             find frequencies of the characters in a String
                input:
                    aaabbc
                output:
                    a3b2c1

mehmet'in day30_06_07_2022   dersinde
         */

        String str="dddaaabbcfffgg";
        String result="";    // a3b2c1

        List<String> strings = Arrays.asList(str.split(""));


        for (String each : new LinkedHashSet<>(strings)) {

            int freq= Collections.frequency(strings,each);
            // if(!result.contains(each))
            result+=each+freq;
        }
        System.out.println(result);

    }
    /*
        Given a String count how many times each character is in the String
        Ex:
            apple
            a - 1
            p - 2
            l - 1
            e - 1
            ==========bu da saim, day 62
     */

    public static void frequencyOfEachChar(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){

            char key = str.charAt(i);

            if(counter.containsKey(key)){
                // the letter/char was found before, this is a duplicate occurrence, so we will need to update the counter for it, which is the value in our map

                counter.put(key, counter.get(key) + 1); // counter.get() the method from the map to get the value of the previous counter, then we add 1 to that number, then assigns that result as the new value linked to that key

            } else {
                // the map does not contain the letter/char -> which means this is the first time the character was found, so we should add it to the map

                counter.put(key, 1);
            }

        }

        System.out.println(counter);
    }

//    public static void main(String[] args) {
//
//        frequencyOfEachChar("banana");}


    }





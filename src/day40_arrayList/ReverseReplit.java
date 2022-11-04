package day40_arrayList;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseReplit {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reversed(words));
    }

    public static ArrayList<String> reversed(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String reverse = "";
            for (int j = words.get(i).length() - 1; j >= 0; j--) {
                reverse += words.get(i).charAt(j);
            }
            words.set(i, reverse);
        }
        return words;
    }
}




/*
Reverse All
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
 */
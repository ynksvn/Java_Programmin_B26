package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongStrings {
    public static ArrayList<String> removeLongString(ArrayList<String> list, int maxLength) {

        list.removeIf(word -> word.length() < maxLength);
        //making a variable with the name of'word' -> if my word length less than what I have as the max number, then remove it.
        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(removeLongString(words, 4));
    }

}

/*
Remove Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings
@param int - max number of characters
@return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
Max number: 4

 */
package day41_arrayList;

import day40_arrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {


        public static ArrayList<String>reverseAll(ArrayList<String>list){

            ArrayList<String>reverseWords = new ArrayList<>();

            for (String each: list){
               reverseWords.add(StringUtil.reverse(each)); //We imported the 'reverse method' that we created before in the StringUtil. Then we added the reversed word into the 'reverseWords' ArrayList

            }
        return reverseWords;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));

        //example of how we can use the method with the previous task
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
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
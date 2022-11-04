package Practice;

import day54_abstraction.animal.creating.Create;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask {

//    Create an ArrayList of Strings
//    add these elements:
//    add Hat
//    add Shoes
//    add Jacket in middle of Hat and Shoes
//    add Towel in the beginning
//    add Car between Towel and Hat
//    Print the ArrayList after each action to see how the change is made
public static void main(String[] args) {
    ArrayList<String> items = new ArrayList<>();
    items.addAll(Arrays.asList("Hat", "Shoes"));
    System.out.println(items);
    items.add(1, "Jacket");
    System.out.println(items);
    items.add(0, "Towel");
    System.out.println(items);
    items.add(1, "Car");
    System.out.println(items);

//    Create an ArrayList of Strings
//    add these elements:
//    Iron Man, Spider Man, Thor, Captain America, Hawkeye
//    remove Thor by index
//    remove Iron Man by element
//    remove the first index
//    Print the ArrayList after each action to see how the change is made
    ArrayList<String> heros = new ArrayList<>();
    heros.addAll(Arrays.asList("Iron Man", "Spider Man", "Thor", "Captain America", "Hawkeye"));
    System.out.println(heros);
    heros.remove(2);
    System.out.println(heros);
    heros.remove("Iron Man");
    System.out.println(heros);
    heros.remove(0);
    System.out.println(heros);

//    Create an ArrayList of Characters
//    Fill the ArrayList with letters from A-Z
//    Print the ArrayList of all the characters

    ArrayList<String> abc = new ArrayList<>();
    abc.addAll(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r","s", "t", "u", "v", "y", "z" ));

    for (String each : abc  ) {
        System.out.print(each);

    }
    System.out.println();
    for (int i = abc.size()-1; i>=0; i--){
        System.out.print(abc.get(i));
    }
    String [] item = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r","s", "t", "u", "v", "y", "z"};
    String [] reverse = new String [item.length];

    for (int i = item.length-1, j =0; i>=0; i--, j++){
        reverse[j] = item [i];

    }
    System.out.println(Arrays.toString(reverse));

    //Reverse Middle Word
    String str = "Hello Java World";
    String [] split = str.split(" ");
    String reversed = "";

    char[] middle = split[1].toCharArray();

    for (int i = middle.length-1; i>=0; i--){
        reversed += middle[i];
    }

    System.out.println(split[0] + " " + reversed + " " + split[2]);

     /*
        reverse the sentence
        Monday is today
         */

    String monday = "Monday is today";
    String [] words = monday.split(" ");
    String today = "";

    for (int i = words.length-1; i>=0; i--){
        today += words[i] + " ";

    }
    System.out.println(today);
/*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */
String [] input = {"java", "longer word", "civic" , "apple", "racecar", "mom", "anna"};
String longest = "";
boolean isPalindrome = true;

    for (String eachInput: input) {

        for(int i =0; i< eachInput.length(); i++){
            if (eachInput.charAt(i) != eachInput.charAt(eachInput.length()-1-i)){
              isPalindrome = false;
                break;

            }
        }
        if (isPalindrome && eachInput.length()> longest.length()){
            longest= eachInput;

        }
        System.out.println(longest.isEmpty() ? "No Polindrome" : longest);

    }

}

}

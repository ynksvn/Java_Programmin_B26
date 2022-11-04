package day19_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();


        String longestWord = "";

        if (wordOne.contains("a") && wordOne.length()> longestWord.length()) {
            longestWord = wordOne;

        }
        if (wordTwo.contains("a") && wordTwo.length()>longestWord.length()) {
           longestWord = wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length()>longestWord.length()) {
            longestWord = wordThree;
        }
            System.out.println(longestWord.isEmpty()? "No single largest word with a" : longestWord + " is the longest with a");
        }
    }
// if(longestWord.isEmpty()

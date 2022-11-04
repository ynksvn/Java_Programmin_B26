package day28_arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        String [] words = {"avocado","pineapple", "orange", "salad", "fish"};

        String longest = words[0];
        String shortest = words[0];

        for (int i = 0; i < words.length; i++ ) {

            if (words[i].length()>longest.length()){
                longest = words[i];
            }
            if (words[i].length()<shortest.length()){
               shortest = words[i];
            }
        }
        System.out.println("The largest: " + longest);
        System.out.println("The smallest: " + shortest);


    }
}


/*
Shortest and Longest words from String array
•Write a program that can return the shortest string element from a
String array
•Write a program that can return the longest string element from a
String array
 */
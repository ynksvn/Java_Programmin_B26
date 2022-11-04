package day29_arrays.day29_arrays;

public class ArrayLongest {
    public static void main(String[] args) {
        String [] words = {"apple","java", "computer", "water"};

        String longest = words[0];
        String shortest = words[0];

        for (String each : words){
            if (each.length() >longest.length()){
                longest = each;
            }
            if (each.length()<shortest.length()){
                shortest = each;

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
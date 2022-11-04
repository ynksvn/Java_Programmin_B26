package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        boolean isAnagram = Arrays.equals(one, two);
        System.out.println(isAnagram ? "anagram" : "not anagram");


    }
}
/*
given two strings
find if they are anagram or not
the characters are the same in both Strings,but the order is different
 */
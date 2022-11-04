package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine().trim();
        int spaces = 0;

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) ==' '){ // str.substring(i; i+1).equals(" ");
                spaces++; // there will be space after every word. so +1 will give me the number of the words
            }
        }

        System.out.println("Number of words: " + (spaces + 1));
    }





}

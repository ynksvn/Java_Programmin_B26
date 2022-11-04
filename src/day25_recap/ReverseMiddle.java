package day25_recap;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words as sentence");
        String word = input.nextLine().trim(); //in case there is extra space between characters


        int firstSpace = word.indexOf(" ");
        int lastSpace = word.lastIndexOf(" "); //str.indexOf(" ", firstSpace+1);
        String middle = word.substring(firstSpace +1, lastSpace); // space is a character. We add +1 to skip the space
        String reverse = "";


        for (int i = middle.length()-1; i>=0; i--){ //-1 gives you the last index
            reverse += middle.charAt(i);

        }
        System.out.println(word.substring(0,firstSpace +1) + reverse + word.substring(lastSpace));
        // with replace: word.replace(middle, reverse);
        // System.out.println(word);

    }
}

 /*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
     */
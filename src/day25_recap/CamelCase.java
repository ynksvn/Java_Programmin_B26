package day25_recap;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase = str.substring(0,1); // 0,1 gives the first character. it is the way to putting the first character into the String right away, because the loop start from i=1. It starts from i=1 because i-1 is to check for spaces and I don't want to do this in the first iteration

        for (int i =1; i<str.length(); i++){

            if (str.charAt(i-1) == ' '){
                camelCase += str.substring(i,i+1).toUpperCase();
                // it is th same definition of str.charAt(i).toUpperCase() in a different type

            }else {
                camelCase += str.charAt(i); //today
            }

        }

        System.out.println(camelCase.replace(" ",""));

    }
}

/*
 Camel Case

    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

    Ex:

        Today is SUNDAY

        Output:

        todayIsSunday
 */
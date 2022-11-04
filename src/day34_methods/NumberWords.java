package day34_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        numberAsWord(3); // this will not print anything
        System.out.println(numberAsWord(3));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt())); //we identified as int and this is the way to use it in scanner without hardcoded
        /*
        unt num = numberAsWord(inpit.nextInt());
        the method return String so we must store as a string variable
         */

    }

    public static String numberAsWord(int num) {
        if (num < 1 || num>10) {
        return num + " is an Invalid number";

        }

        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Nine", "Ten"};
        return words[num - 1]; // it will convert ti an index number

    }
}
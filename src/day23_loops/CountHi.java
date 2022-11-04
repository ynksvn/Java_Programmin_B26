package day23_loops;

import javax.swing.*;

public class CountHi {
    public static void main(String[] args) {


        String str = "aaaahiahhihibbbcch";
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) { // because last letter is h and we made code to check h and the letter next to h

            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;

            }

        }
        System.out.println(count);

    }
}
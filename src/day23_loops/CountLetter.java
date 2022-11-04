package day23_loops;

public class CountLetter {
    public static void main(String[] args) {
        String word = "aabbcaa";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a') { //checks if every character is equ
                // al to a
                count++;
            }

        }
        System.out.println(count);
    }
}
/*
Given a String and We want to count how many 'a' characters we have
Challenge: adjust so that we can check for not only \a\ but any character
 */
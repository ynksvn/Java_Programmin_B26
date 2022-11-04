package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String[] words = {"java", " longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrome = "";

// outer loop is iterating through the array
        for (String eachWord : words) { //eachWord == word[i]

            boolean isPalindrome = true;
            //inner loop is iterating through each String element
            for (int i = 0; i < eachWord.length(); i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    //-i points the last digit. it changes its value with ever iteration. Helps us to compare the first digit to last one
                    isPalindrome = false;
                    break;

                }
            }

            if (isPalindrome && eachWord.length() > longestPalindrome.length()) {
                longestPalindrome = eachWord;
            }
            System.out.println(longestPalindrome.isEmpty() ? "No Polindrome" : longestPalindrome);
        }

    }
    }






 /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */
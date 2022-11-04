package GentritsCodes.Task2;

import my_utilities.StringUtil;

public class FrequencyOfCharacters {
    /*
    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequency(str));
    }

       private static String frequency(String str) {  //return type as String.

        String checked = "";   // I created an empty String to store my new information
        for (int i = 0; i < str.length(); i++) {  //to check the all letter I created loop.
            int count = 0;  // countlar iflerin disina yaziliyor

            if (checked.contains("" + str.charAt(i))) {  // if the elements are same, pass it
                continue;
            }
            for (int j = 0; j < str.length(); j++) { //to find out how many times the letter occurs, we created second loop.
                if (str.charAt(i) == str.charAt(j)) { // if the letters are same, count
                    count++;
                }
            }
            checked += str.charAt(i) + "" + count;
        }
        return checked;


    }
}

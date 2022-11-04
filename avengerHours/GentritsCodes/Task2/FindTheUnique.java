package GentritsCodes.Task2;

import my_utilities.StringUtil;

public class FindTheUnique {
    /*
     String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF"
     */

    public static void main(String[] args) { //main method
        String str = "AAABBBCCCDEF";         // String value
        System.out.println(Unique(str));    // calling the Unique method
    }

    private static String Unique(String str){ // cant have 2 public static void methods in the same class
        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            if (checked.contains("" + str.charAt(i)))
                continue;

            int count = 0;
            checked += str.charAt(i);

            for (int j=0; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }}
            if (count == 1) { // count 1e edit degilse unique degildir
                unique += str.charAt(i);
            }


        }
        return unique;
    }
}








package GentritsCodes.Task2;

public class StringSameLetters {
    /*
     String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false
     */
//    public static void main(String[] args) {
//        String str = "abc";
//        String str2 = "cab";
//        String str3 = "abb";
//        System.out.println(same(str, str2));
//        System.out.println(same(str, str3));
//        System.out.println(same(str2, str3));
//    }
    public static void main(String[] args) {
        String str= "cba";
        String s = "acb";

        System.out.println(isSameLetter(str,s));
    }

    private static boolean isSameLetter(String str, String s) {

        boolean result = true;
        if (str.length() == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (str.contains("" + s.charAt(i))) {
                    str = str.replaceFirst("" + s.charAt(i), "");
                }
            }
        }
        if (str.isEmpty()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

//
//    public static boolean same(String str1, String str2) { // defining 2 strings
//
//
//        if (str1.length() != str2.length())  //if str1's length is not equal to str2 length, it is false
//            return false;
//
//        boolean isSame = true;
//
//        if (str1.length() == str2.length()) {
//            for (int i = 0; i < str2.length(); i++) {
//
//                if (!str2.contains(str1.charAt(i) + "") || !str1.contains(str2.charAt(i) + "")) {
//                    isSame = false;
//                }
//            }
//        }
//            return isSame;
//
//        }
//
//    }

//   String str2 ="rgdctebae";
//        String str3 = "abcdterrg";
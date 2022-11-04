package day23_loops;

public class Palindrome {
    public static void main(String[] args) {

        String str = "racecar";
        //reverse the string
        String reverse = "";

        for (int i = str.length()-1; i>=0 ;i--){
           reverse += str.charAt(i);

        }
        System.out.println(reverse);

        if (str.equals(reverse)){
            System.out.println(str + " is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
 System.out.println(str.equals(reverse)? "Palindrome" : "Not Palindrome");
    }
}

/*
Palindrome: it is the same reading from the beginning and end
Ex: mom
racecar

anna
madam

Task: Check if a word is palindrome

Flow: declare some initial String
how to reverse a String
check if the reverse version is the same as the orginal
 */
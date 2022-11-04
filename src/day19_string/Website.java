package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the url: ");

        String url = input.nextLine();  // www.google.com
                                        // 0123456789101112

        System.out.println(url.substring(4,10)); // only work with hardcoded inputs when you already which website will be entered
       String website = url.substring(4, url.length() -4);
        System.out.println(website);




    }
}
 /*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

if (validStart && validEnd){
    System.out.println(website + " is a valid website");
}else{
    if (!validStart){
    System.out.println("www is needed");
}
    if (!validEnd){
        System.out.println("invalid address");
    }

    }
}
    }

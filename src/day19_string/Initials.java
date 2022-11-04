package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String name = input.next().toUpperCase();

        System.out.println("Please enter your last name");
        String surname = input.next().toUpperCase();

        System.out.println(name + " " + surname);
        System.out.println("" + name.charAt(0) + surname.charAt(0)); // name = name.toUpperCase();
                                                                   //char firstLetter = name.charAt(0);
                                                                    // or char firstLetter = name.to:UpperCase().charAt(0);




    }
}

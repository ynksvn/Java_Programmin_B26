package day33_methods;

import java.util.Scanner;

public class Age {

    public static void age(int year){
        System.out.println("Your age is " + (2022- year));


    }

    public static void main(String[] args) {
        age(1985);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birthYear = input.nextInt();;
        age(birthYear);
    }
}

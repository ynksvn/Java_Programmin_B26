package day10_scanner_practice;
import java.util.Scanner;
public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite book? ");
        String book = input.nextLine();

        System.out.println("What's your age?  ");
        byte age = input.nextByte();

        System.out.println("What's your favorite number?  ");
        long favoriteNumber = input.nextLong();

        System.out.println(book );
        System.out.println(age );
        System.out.println(favoriteNumber );



    }
}


/* Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs */
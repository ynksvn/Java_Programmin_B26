package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number for a month");
    int mon = input.nextInt();


        String[] months = {"January", "February" , "March" , "April" , "May" , "June" , "July" , "August", "September" , "October" , "November" , "December"};


        System.out.println(months[mon-1]);


    }




}
/*
Ask the user the month number they want, print the month name
1 - January
12- December
Assume only valid numbers are given
 */
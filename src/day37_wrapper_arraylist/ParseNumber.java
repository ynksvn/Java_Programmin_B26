package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {

    public static void main(String[] args) {

        String year = "2022";
        //normal concatenation - connecting each other
        System.out.println("This year is " + year);
        System.out.println("Next year will be " + (year +1)); //since it is String it didn't do the calculation

        int numYear = Integer.parseInt(year);
        // converting String to int
        System.out.println("This year " + numYear + "\nNext year will be " + (numYear+1));

        Scanner input = new Scanner(System.in);
        System.out.println("Tell me how old you are, please");
        String str = input.nextLine();
        //tell what their age will be in 5 years

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        //We assume the answer will be " I am x years old". So we have to split the characters to be able to pick the age = taking the middle element

        System.out.println("In five years, you will be " + (age +5));



    }
}

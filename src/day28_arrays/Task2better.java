package day28_arrays;

import java.util.Scanner;

public class Task2better {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many number do you want to include?");
        int num= scan.nextInt();
        int sum=0;
        int average = 0;

        int [] numbers = new int[num]; // array

        for (int i = 0; i<numbers.length; i++){
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
            average = sum/numbers.length;
        }
        System.out.println("The average is " + average);

    }

}

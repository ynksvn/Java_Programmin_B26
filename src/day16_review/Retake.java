package day16_review;

import java.util.Scanner;
/*
 create a class Retake

    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%
 */


public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What was the grade?");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it?");
        int attempt = input.nextInt();
        boolean validAttempts = attempt < 4 && attempt > 0;

        if (attempt == 1) {
            grade = grade - (int) (grade * 0.1); // manuel one
            System.out.println();
        } else if (attempt == 2) {
            grade -= grade * 0.2;
        } else if (attempt == 3) {
            grade *= 0.65;
        } else {
            System.out.println("Not valid attempt number");
        }
        if (validAttempts) {
            System.out.println(grade);
        }
    }
}



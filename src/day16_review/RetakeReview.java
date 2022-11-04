package day16_review;

import java.util.Scanner;

public class RetakeReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the grade?");
        int grade = input.nextInt();
        System.out.println("How many times did you attempt?");
        int attempt = input.nextInt();

        boolean validAttempt = attempt <4 && attempt>0;

        if (attempt == 1) { //first attempt
            grade = grade - (int) (grade * 0.1); //it needed to be converted to int. When int number multipy with double, it turns to double.

        }else if(attempt == 2){
            grade -= grade*0.2; // shorthand casting automatically

        }else if (attempt == 3){
            grade *= 0.65; // alternative way to calculate

        }else{
            System.out.println("Invalid attempt number");
        }

        if (validAttempt) { //additional code with boolean to avoid grade when there is invalid attempt

            System.out.println(grade);

        }
    }
}

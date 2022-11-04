package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] studentOne  = {"007", " James ", " Bond ", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String[4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo[0] = "010"; //this is how we hardcoded
        studentTwo [1] = "Jack";
        studentTwo [2] = "Sparrow";
        studentTwo [3] = "7";
        System.out.println(Arrays.toString(studentTwo));

        /*
        String [] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id");
        studentThree [0] = input.nextLine();
        System.out.println("Enter your first name");
        studentThree [1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree [2] = input.nextLine();
        System.out.println("Enter your batch number");
        studentThree [3] = input.nextLine();
        System.out.println(Arrays.toString(studentThree));
        */

        Scanner input = new Scanner(System.in);
        String [] studentFour = new String [4];
        String [] questions = {"student id", "student first name", "student last name", "student batch"}; //to be able to add questions like in the scanner

        for (int i = 0; i<4; i++){ // i is the number, can be used multiple
            System.out.println(questions[i]); //reading each element of the question array (how we print the questions)
            studentFour [i] = input.nextLine(); //assigning the Scanner input into our studentfour
        }
        System.out.println(Arrays.toString(studentFour));


    }
}
/*
0 -id
2-first name
2- last name
3 - batch number
 */
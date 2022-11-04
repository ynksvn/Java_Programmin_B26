package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskGradeBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you want to add to the book: ");
        int students = input.nextInt();

        String[] names = new String[students];
        int[] scores = new int[students];
        char[] grades = new char[students];
        input.nextLine();

        for (int i = 0; i < names.length; i++) {

            System.out.println("Enter the student name:");
            names[i] = input.nextLine().trim();
            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);

            System.out.println("Enter the score");
            input.nextInt();


            if (scores[i] >= 85) {
                grades[i] = 'A';
            } else if (scores[i] >= 75) {
                grades[i] = 'B';
            } else if (scores[i] >= 65) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';

            }


        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i] + " |");


        }
    }
}

/*
Gradebook students = {"James Bond", "Leonardo DiCaprio", "Julie Roberts", "Robert Jr"};
        Declare three arrays:
        1. String array which will hold names for the students (give values)
        2. Int array which has the score of the student got in the quiz (give values)
        3. Char array which will have some letter grade based on the score (empty)
        4. Output the gradebook at the end with all the information
        Grade scale:
        Above 85: A
        Above 75: B
        Above 65: C
        Other: D
        Challenge: Accept all the
        information with Scanner

 */
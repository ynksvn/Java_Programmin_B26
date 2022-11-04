package day16_review;

import java.util.Scanner;

public class SoccergameRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes left in the game");
        int min = input.nextInt();

        if (min <= 90 && min >= 0) {
            if (min >= 75) {
                System.out.println("just getting started");

            } else if (min >= 60) {
                System.out.println("players are doing their best");

            } else if (min >= 30) {
                System.out.println("middle of the game is going great");
            } else {
                System.out.println("the end of the same is approaching  ");
            }

        } else {
            if (min < 0) {
                System.out.println("minutes cannot be a negative number");
            } else {

                System.out.println("games cannot be longer than 90 minutes");
            }


        }

    }
}

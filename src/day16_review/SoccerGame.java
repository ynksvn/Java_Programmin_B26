package day16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left in the game");
        int min = input.nextInt();

        if (min >= 0 && min <= 90) {

            if (min >= 75) {
                System.out.println("Game just started");
            } else if (min >= 60) {
                System.out.println("players are doing their best");
            } else if (min >= 30) {
                System.out.println(" middle of the game is going great");
            } else {
                System.out.println("the end of the game is approaching");
            }
            } else {
                if (min < 0) {
                    System.out.println("minutes cannot be a negative number");
                    } else {
                        System.out.println("games cannot be longer than 90 minutes");
                        // sout"(minutes <0? "Minutes cannot be negative" : "games cannot be longer than 90") Ternaries
                    }


                }
            }
        }


/*
 declare and assign a minutes variable
    use the minutes value to determine how much time is left in the soccer game

    use these ranges to determine the outputs:

    - any number less than 0 and more than 90 are not valid:

        when the minutes is less than 0:
            print: minutes cannot be a negative number
        when the minutes is more than 90:
            print: games cannot be longer than 90 minutes

    - when the minutes are between 90 - 75
        print: just getting started

    - when the minutes are between 74 - 60
        print: players are doing their best

    - when the minutes are between 59 - 30
        print: middle of the game is going great

    - when the minutes are between 29 - 0
        print: the end of the same is approaching

 */
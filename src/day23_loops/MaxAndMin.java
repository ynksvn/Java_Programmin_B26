package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483647;              // when it is assigned as 0, it will give wrong result with negative numbers
        int min = 2147483647;              /* the biggest and smallest int numbers can be assigned.
                                       int max = -2147483647- any number will be bigger than this
                                       int min = 2147483647 - any number will be smaller than this */

        int n = 0;

        while (n < 5) {   // this states the number of iterations and 0 1 2 3 4
            n++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }


        }

        System.out.println("Max: " + max);
        System.out.println("Min " + min);


    }
}
/*
write a program that asks user to enter 5 numbers and returns the biggest and smallest from those 5
 */
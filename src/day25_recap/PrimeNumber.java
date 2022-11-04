package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isPrime = number>2; //to make it positive number and not include 1 since it is not a prime number

        for (int i = 2; i < number; i++) { //all numbers are divisible to 1 and itself. So I should check the numbers can be divisible to 2 and 3
            if (number % i == 0) {
                isPrime = false;
                break; // We need a break because of the first statement
            }

        }

        if (isPrime) { // if you didn't define the boolean as n>2, you could add number !=1 && into the if statement to get the result of 1 is not prime
            System.out.println(number + " is prime");
        }else{
        System.out.println(number + " is not prime");
    }
    }
}
/*
[IQ] Prime number [Loops]

    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            11

        Output:
            prime

    Ex:
        Input:
            10

        Output:
            not prime
 */
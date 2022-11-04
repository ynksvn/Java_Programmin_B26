package GentritsCodes.Task1;

public class PrimeNumber {
    public static void main(String[] args) {
        int nums =-2;
        isPrime(nums);

        int n = 5;
        isPrime(n);
    }

    public static boolean isPrime(int number) {

        boolean isPrime = number >= 2; //to make it positive number and does not include 1 since it is not a prime number

        for (int i = 2; i < number; i++) { //all numbers are divisible to 1 and itself. So I should check the numbers can be divisible to 2 and 3
            if (number % i == 0) {
                isPrime = false;
                      }}


        if (isPrime) { // if you didn't define the boolean as n>2, you could add number !=1 && into the if statement to get the result of 1 is not prime
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is not prime");
        }
        return isPrime;
    }
}
/*
Numbers - Prime Number
Write a method that can check if a number is prime or not.

A prime number (or prime integer, often simply called a "prime" for short) is a positive integer that has no positive integer divisors other than 1 and itself.
 */
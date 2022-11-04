package GentritsCodes.Task1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void EvenOrOdd (int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        return;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num= scan.nextInt();

        EvenOrOdd(num);

    }
}
/*
Write a method which can identifies gived number is even or odd
Ex:      //EvenOrOdd(5);
        //EvenOrOdd(6);


 */
package GentritsCodes.Task4;

import java.util.Scanner;

public class T5_DivideWithoutDivision {

//    Numbers - Divide without / operator
//    Write a method that can divide two numbers without using division operator.

    public static void main(String[] args) {

 int result = 0;

        Scanner scan=new Scanner(System.in);
//create a scanner instance for receives input
// from the user - input from keyboard
        System.out.print("Enter the value to num1: ");
        int num1=scan.nextInt();//Reading the input for num1
        System.out.print("Enter the value to num2: ");
        int num2=scan.nextInt();//Reading the input for num2

        while(num1>=num2) {
            num1=num1-num2;
            result++;

        }
        System.out.println("Division is: "+result);

        //Alternative way
        int x = 4;
        int y = 2;
        Division(x,y);
    }


    public static int Division (int a, int b) {
        int result = Math.floorDiv(a,b); // it is in java.lang - library

        System.out.println(result);
        return result;
    }

    }


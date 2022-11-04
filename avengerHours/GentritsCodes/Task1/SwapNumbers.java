package GentritsCodes.Task1;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y=20;
       x += y; //x = 10 +20 = 30; x=30 -> x=30 y=20
       y= x-y; // y= 30-20 = 10; y=20 -> x=30 y=10
       x= x-y; // x= 30-10 =20; x=20 -> x=20 y= 10

        System.out.println("After Swapping: \n X: "+ x + "\nY: "+ y);

        // With Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swapping: \n A: "+ a + "\nB: "+ b);
    }

}


/*
4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
 */
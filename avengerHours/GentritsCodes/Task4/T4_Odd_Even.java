package GentritsCodes.Task4;

import java.util.Scanner;

public class T4_Odd_Even {

//    Write  a method which can identifies given number is even or odd
//    EX:
//    identify(5) ->  "Odd"
//    identify(6) ->  "Even"

    public static void main(String args[])
    {
        //To take input from the user
        //Create an object of scanner class
        Scanner input = new Scanner(System.in);
        int num;  //Declare a variable
        System.out.println("Enter a number:");
        num = input.nextInt();

        //If number is divisible by 2 then it's an even number
        //else odd number
        if ( num % 2 == 0 )
            System.out.println("identify ("+ num + ") ->   " +  "\"Even\"");
        else
            System.out.println("identify ("+ num + ") ->   " +  "\"Odd\"");
    }
}


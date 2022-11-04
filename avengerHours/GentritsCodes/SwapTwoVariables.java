package GentritsCodes;

import java.sql.Time;
import java.util.Arrays;

public class SwapTwoVariables {
    public static void main(String[] args) {

//        Questions:- Please explain briefly the algorithm of swapping 2 numbers in coding. (Explain both ways
//        Time limit: 3 mins.

        //this is the basic method
        int one = 4;
        int two =5;
        int temp ;
        temp= one; // temp = 4
        one=two; // a= 5
        two=temp; // b=4

        System.out.println("one is " + one + " two is " + two);

        //Alternative way

        int x = 4;
        int y = 5;
        x = x+y; //4 + 5 =9 so x holds the sum which is 9
        y = x-y; //9-5 =4 when i do the subtraction from x-y which is 9-5, it will give me 4 which is actually first x value. so y's new values is x's previous value
        x= x-y;  //9-4 =5 So to reassign the y;s previous value to x, i will do same subtraction with the new value of y. so it will be 9-4. it will give me the result of 5 which is the first value of 5

        System.out.println("x is " + x + " y is " + y);

        // Declare two strings
        String a = "Hello";
        String b = "World";

        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                a + " and b = "+b);

        // append 2nd string to 1st
        a = a + b;

        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());

        // store initial string b in string a
        a = a.substring(b.length());

        // print String after swapping
        System.out.println("Strings after swap: a = " + a + " and b = " + b);





    }
}

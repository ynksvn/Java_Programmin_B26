package GentritsCodes.Task1;

import java.math.MathContext;

public class Numbers {

    public static void main(String[] args) {
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
/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */
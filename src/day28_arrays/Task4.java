package day28_arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int [] reverse = new int[number.length];


        for (int i = number.length-1; i > 0; i--) {
            System.out.print(number[i]);
        }

    }

}

/*
Reverse Array
Write a program that will reverse the order of any given array
Ex:
Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
 */
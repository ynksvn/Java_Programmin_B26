package day28_arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i < number.length; i++) {
           number[i] = i+1;

        }
        System.out.println(Arrays.toString(number));
    }

}



/*
100 number array
1. Create an int array called numbers that has length of 100
2. Assign 1-100 to each index of the array.  Then print your number
array
 */
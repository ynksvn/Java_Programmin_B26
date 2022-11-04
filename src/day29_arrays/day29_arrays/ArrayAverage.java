package day29_arrays.day29_arrays;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int [] number = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int average = 0;
        int sum = 0;

        for (int i = 0; i< number.length; i++){
            sum+= number[i];
            average = sum/ number.length;
        }
        System.out.println("The average is " +average);



        for (int num : number){
            sum +=num;

    }
        System.out.println("average " + (sum/number.length));
}

/*
    Average Number from Array
    Given an int array calculate the average number
-> Make it flexible so it will work with any array size
        Examples:
        [1,2,3] -> average: 2
        [10, 15, 5, 6] -> average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
*/
    }


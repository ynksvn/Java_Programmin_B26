package day28_arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {


            if (nums [i] % 2 == 0) {
                 even++;

            } else {

                odd++;
            }
        }
        System.out.println(Arrays.toString(nums));
            System.out.println("The number is " + even);
            System.out.println("The number is " + odd);


    }
}
/*
Even and odd from array
Write a program that can count the even and odd number from an array of
integers
Ex:
Input: [4,1,3,12,5]
Output:
Even: 2
Odd: 3
 */
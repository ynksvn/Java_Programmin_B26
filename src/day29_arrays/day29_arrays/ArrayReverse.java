package day29_arrays.day29_arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int [] reverse = new int[number.length];
        int count = 0;

//        for (int i = number.length-1; i > 0; i--) {
//            System.out.print(number[i]);
//        }
        for (int i = number.length-1, j=0; i > 0; i--, j++) { //int i = last digit. I have 2 values i=4 j=0. i is going backwards, j is going forwards
            reverse[j] = number[i];
          //  System.out.print(number[i]);
        }
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reverse));
    }

    public static class ArrayZero {
        public static void main(String[] args) {
            int [] nums = {10, 0, 5, 0, 1, 0};
            int [] nums2 = new int[nums.length];
            int n = 0;

            for (int i =0; i< nums.length; i++){
                if (nums[i]!=0){
                    nums2[n++] = nums[i];
                }
            }
            System.out.println(Arrays.toString(nums2));

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


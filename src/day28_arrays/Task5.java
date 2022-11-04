package day28_arrays;

import java.util.Arrays;

public class Task5 {
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




/*
Move Zeros
Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
Ex:
Input:
[10, 0, 5, 0, 1, 0]
Output:
[10, 5, 1, 0, 0, 0]
 */
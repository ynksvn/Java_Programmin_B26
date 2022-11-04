package day29_arrays.day29_arrays;

import java.util.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = ""; // to print numbers we should use string

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                even++;
//                evenNums += nums[i] +",";
//            } else {
//                odd++;
//                oddNums += nums[i]+",";
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println("The number of even: " + even + ". Those numbers: " + evenNums);
//        System.out.println("The number of odd: " + odd + ". Those numbers: " + oddNums);

        for (int num : nums){
            if (num%2 ==0){
                even++;
                evenNums += num + " ";

             }else{
                odd++;
                oddNums += num +" ";
            }
        }
        System.out.println("The number of even: " + even + ". Those numbers: " + evenNums);
        System.out.println("The number of odd: " + odd + ". Those numbers: " + oddNums);

        }

    }

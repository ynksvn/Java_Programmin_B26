package day32_arraysRecap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AverageOFEach {
    public static void main(String[] args) {
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
               {10, 20, 30,},
      };

        double total = 0;
        int totalLength = 0;

        for (int [] eachArray: nums) {
           // System.out.println(Arrays.toString(eachArray));
            //it is array type
            double sum = 0; // it should be defined after the arrays but before the second statement

            for (int eachNumber: eachArray){
                System.out.println(eachNumber);
                //it is int type
                sum += eachNumber;
                int [] groupOne = {3, 4, 5, 6};
        nums [0] = groupOne;

            }

            System.out.println(Arrays.toString(eachArray) + "the average is " + (sum/eachArray.length));
            total += sum;
            totalLength += eachArray.length;


        }
        System.out.println("Average of the whole 2D array: " + (total/totalLength));


    }
}
  /*

    Given a 2D array find the average of each inner array
    and extra: average of the whole array

    Ex:

        3, 4, 5, 6
        5, 2, 6
        10, 20, 30

     */
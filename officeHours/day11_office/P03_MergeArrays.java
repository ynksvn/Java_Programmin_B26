package day11_office;

import java.util.Arrays;

public class P03_MergeArrays {
//    Write a return method that can concat two arrays
//    Numbers - odd & even
//office hours
public static void main(String[] args) {
    int [] arr = {1,2,3,4};
    int [] arr2 = {5,6,7,8,9};

    mergeTwoArray(arr,arr2);
}



    public static void mergeTwoArray(int [] arr, int [] arr2){
        int [] all =  new int [arr.length + arr2.length]; //creating new array to store the merged one

        int i = 0; //
        for (int each: arr){ //each data from first array

            all[i++] =each; // add into new array, until the last digit. after using the i, go to next one

        }
        for (int each : arr2){
            all[i++] =each;
        }

        System.out.println(Arrays.toString(all));

    }


}

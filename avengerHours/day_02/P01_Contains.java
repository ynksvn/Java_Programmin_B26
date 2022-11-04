package day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class P01_Contains {
    public static void main(String[] args) {
     int []arr = {4,5,1,5,6};
     contains(arr); //this calls the method, I still have to print it
        System.out.println(contains(arr));

     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list.contains(2));


    }
    public static boolean contains(int[] array){
       for (int each :array){
           if (each ==2 || each ==3){
               return true; // return statement stops the execution
           }
       }
        return false;
    }
    //overloading this method - same method name with different parameters
    public static boolean contains(ArrayList<Integer> list){
        if (list.contains(2) || list.contains(3)) {//We don't need for loop because we already have java utilities to be able to use.
            //it is primitive but we are searching for this primitive inside Array object, it is autoboxing

            return true;
        }
        return false;
    }

}

/* Write a method that accepts an array and returns true if it contains 2 or 3
int[] x  = {2,5,4,6,,8,9} -> true
int [] y = {4,3,0,100,55} -> true
int [] z- {4,5,1,5,6} -> false


 */

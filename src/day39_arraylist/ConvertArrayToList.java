package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3};// It is an Integer array. ArrayList does not accept primitive types. This is not collection type

        Arrays.asList(arr);
        // converts the array to a collection type

        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(arr));
        // it is empty. It is creating an ArrayList with values from a collection type. it is still too much steps to do. There is an easier way to do it
        System.out.println(nums);

        //Creating an ArrayList with some initial values
        ArrayList<Integer>other = new ArrayList<>( Arrays.asList(4,5,6,7));
        System.out.println(other);




    }
}

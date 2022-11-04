package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {

public static ArrayList<Integer> removeDuplicates(ArrayList<Integer>numbers){

    numbers.removeIf(num-> Collections.frequency(numbers, num)>1);
    //num is each element. Frequency method is in the utility class. If frequency more than one, remove it. Frequency method you can use it with ArrayList. not with Array
    return numbers;
}

    public static void main(String[] args) {
       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9));
        System.out.println(removeDuplicates(nums));
    }
}


/*
Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
 */
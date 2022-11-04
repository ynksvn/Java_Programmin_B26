package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbers {
    public static ArrayList<Integer> sumFromString(ArrayList<String> list) { // this is the parameter of the method

        //We should create a new ArrayList to store the new value
        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list) { //goes through the every element of the ArrayList from parameters

            //to refactor:

            int currentSum = getCurrentSum(each);
            sums.add(currentSum);

        }
        return sums;
        //in order to code works, we have to add return
    }

    public static int getCurrentSum(String each) { //it recreated as a method
        //to refactor:
        int currentSum = 0; // it should be between loops. This is resetting for the next step

        for (String eachDigit : each.split("")) { /*to be able to use this to create a new Array. It converts an array for each element. (converting the String, each to an array by split with an empty space, it means that each String will be seperated with each character as separate String elements)
         "123" --> ["1", "2", "3"] and then you loop through that array*/
            //currentSum += eachDigit will not work
            currentSum += Integer.parseInt(eachDigit);
            //we preferred to use parseInt method, because it gives you int type

        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("123","1111","34")); // this is the format that we are calling the method
        System.out.println(sumFromString(list));
    }
}


/*
String numbers to sum
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
 */
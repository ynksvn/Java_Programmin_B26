package day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P02_FreqOfChars {
    public static void main(String[] args) {
        /*
        Write a program that can find the frequency of character from a String (don't use nested loop)
        "AABCCDDEE"-> "ABCDE"
        output: A2B1C2D2E2
         */

        String str = "AABCCDDEE"; //to be able to use the freq method of the collection, we should have a collection. We need to conversion from string to a collection.
        //String + split() -> String array - includes all the elements one by one as a String elements + asList() -> String ArrayList


        String[] strArray = str.split(""); //it wil return the array as a string element
        System.out.println(Arrays.toString(strArray));
        //next step is ArrayList

        ArrayList<String>strList = new ArrayList<>(Arrays.asList(strArray)); //String is already an object, non-primitive part. No need to autoboxing
        System.out.println(strList);
        //It is converted to ArrayList so we can use the frequency method

        String result ="";
        for (String each:strList){ // first I want to determine the frequency, then collect all of them in a String variable,
            int freq = Collections.frequency(strList, each); // it belongs to collections class. Our collection is strList, we search for amoung the strList is each element

           // result+= each + freq;  this will return to A2A2B1C2C2D2D2E2E2 when we print. We should remove the duplicates. So we should use continue statement to remove the duplicates

            if (result.contains(each)) {
                continue; // It means if my result contains each then continue. if the elements is same it will switch to next element
            }
                result += each+freq;
            }
        System.out.println(result);
        System.out.println("----------------------------");

        //Alternative way:
        //String toCharArray() -> char[] - char array -> We should  convert the charArray to character+ but first we should do for loop - to unbox each element + ArrayList<Character>

        String str2 = "AABCCDDEE";

        char [] chArray = str2.toCharArray(); // First, created the Array. all the elements are char elements
        System.out.println(Arrays.toString(chArray)); //char is primitive type, We can't use ArrayList method

       // ArrayList<Character> chList = new ArrayList<>(Arrays.asList(chArray)); //it gives error because of the primitive type array

        ArrayList<Character> chList = new ArrayList<>();

        for (Character each : chArray) { // I will add the all the elements to my chList one by one
            chList.add(each);
        }
        System.out.println(chList); // we have a list now

        String result2 ="";
        for (Character each: chList){
            int freq = Collections.frequency(chList, each);

            if (result2.contains(""+ each)) {
                continue; // It means if my result contains each then continue. if the elements is same it will switch to next element
            }

          //  result2 += freq+each;    we can't conclude an integer with a char
            result2 += "" + freq +each; //converted them into the String
        }
        System.out.println(result2);



    }



    }


package day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVsArrayList {
    /*
    ArraList -> collection of data. It is a data structure, a member of collection framework. A class of java that is similar to array but allows us to only store objects. Sise iz dynamic. It has own method - unlike array like add(), get(), remove() etc

     */
    public static void main(String[] args) {
        //declaring an array
        int [] arr1; // accepts obj and primitive - just declared a variable name

        //declaring an ArrayList
        ArrayList<Integer> list1; // it must be onject type

        // instantiating (ornekle desteklemek) Array and ArrayList
        arr1 = new int[4]; //we can live [] empty. we have to declare the size, because Array's length is fixed
        arr1[0] = 100; //[100,0,0,0]
        list1 = new ArrayList<>(); // [] declare as empty. Its size is dynamic
        list1.add(100); // [100]
        list1.remove(0); // size =0 - empty

        int number =50;
        //can be added into to ArrayList by autoboxing
        list1.add(number);
        System.out.println(list1); // it will print [50]
        list1.get(0); //this is wrapped class Integer object. But my number is still int primitive

        //initializing an array with specific values
        int[] arr2 ={1,2,3};

        //initializing an ArrayList with specific values
       // ArrayList<Integer> list3 = new ArrayList<>(1,2,3); We can't add numbers because this structure only accepts a collection type, doesn't accept listing type
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4));

       // ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr2)); This cannot be executed. Because as a single entity, it cannot be autoboxed. But it can autobox if we specify one by one
        Integer []arr3 = {1,2,3}; //it will autobox when i define like this - a wrapper class array
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr3));

        System.out.println("-------------------------------------------");

        // Methods for ArrayList object

        int[] arr5 = {100,200,300};
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4));

        int length = arr5.length;//this is the only property we have for Array. Array doesn't have its own methods
        // Arrays utility class methods. They are already created, you only need t call it and use it for Array objects. They are equals(), sort(). toSring(), binarySearch(), deepToString(). asList()..etc The syntax is different. className.methodName.Array parameter.

        list5.add(20); // Collection Utility Class.Collection classname.method name, Collection parameter

        //using utility classes

       // arr4.sort(); - sort class doesn't belong to Array class. It belongs to Arrays Utility class. I can use with a different syntax so I can pass my array as a different parameter
        Arrays.sort(arr5);

       // list5.reverse(); - Not working because it doesn't belong to ArrayList class, it belongs to my utility collection class. To be able to use:
        Collections.reverse(list5);

        //ArrayList can use its own methods besides it can use collections class method. However, Array doesn't have method. It has ony  one property. It can only use Arrays class methods.
        //Arrays class is created by java. The one we have as ArrayUtil is what we creates as a custom class







    }
}

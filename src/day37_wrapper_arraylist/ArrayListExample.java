package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        // add/assign to an array [index] = value

        numbers.add(100); // we can't add multiple like this
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);

        // in array how we access each element:
        // arr[index]

        numbers.get(0); // this is a method, it will not print
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
       // System.out.println(numbers.get(30)); will gibe index out of bounds exception.

        //How you can find how many elements you have in the array
        System.out.println(numbers.size());


    }
}

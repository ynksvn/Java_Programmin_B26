package GentritsCodes.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class T2_RemoveSomeValues {

    //2. ArrayList -- Remove some values.
//    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 500, 6, 120, 1, 305, 60, 20, 95, 106, 2, 99, 101, 4, 59));

        Iterator<Integer> it = list.iterator(); // iterator object - for looping
        while(it.hasNext()){ // checks if there is an element next to it, if not stop the loop
            if(it.next() > 100){ // move to the next element and then return it
                it.remove(); // removing the element from the list
            }
        }

        System.out.println(list);
}}


package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchBadPairs {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i=0; i<words.size(); i+=2){
            //to able to swap them - not mix them - we should make variables

            String temp = words.get(i); //this is the current word. I can swap it by reassigning.This String is my temporary container
            words.set(i,words.get(i+1)); //set method accepts the element that you want to change. Storing the second element "in" to position of i -0 -> (in, Cat, the, hat)
            words.set(i+1, temp); //(in, Cat, hat, the)

            System.out.println(words);


        }



    }

}


/*
    Given an ArrayList of words switch position for
    each pair in the List. A pair is an element and
    the element next to it.
    The given ArrayList will always have an even
    number of elements so each element will
    always have a single pair
Changing the order of the pairs
    Ex:
    Input: {"Cat", "in", "the", "hat"}
    There is two pairs:
    "Cat" and "in"
    "the" and "hat"
    Output: {"in", "Cat", "hat",
    "the”}
 */
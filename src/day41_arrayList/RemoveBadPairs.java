package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    //instead of using the remove, make a new ArrayList that stores only good pairs, because when you remove it, moving the indexes causes problem

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer>list) {
        ArrayList<Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) { //We did +2, because we are checking for the pairs. To be able to check each two numbers.
            if (list.get(i) < list.get(i + 1)) { //if the first number is smaller than the second number, we will add to our new Array list for good pairs
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));
            }
        }
        return goodPairs;


    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,6,1,1,10,8,7));
        System.out.println(removeBadPairs(nums));
    }

}


/*
Remove Bad Pairs
Create a method that will accept an Integer ArrayList and check for
bad pairs. A pair is an element and the element next to it.
A bad pair is whenever the first number in the pair is bigger then
the
second number. Remove any bad pairs for the ArrayList and return
the
ArrayList with no bad pairs
Note: The given ArrayList will always be an even number of
elements, so each number always has one pair
@param nums - Given ArrayList of numbers
@return - ArrayList of numbers
 */
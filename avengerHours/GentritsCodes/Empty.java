package GentritsCodes;


import jdk.jfr.Frequency;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Empty {

    public static void main(String[] args) {

        ArrayList<Integer> firstList=new ArrayList<Integer>(Arrays.asList(12, 4, 67, 90, 34));

//second array list
        List<Integer> secondList=new ArrayList<Integer>(Arrays.asList(12, 4, 67, 0, 34));

    }

    public static ArrayList<Integer> difference(ArrayList<Integer> one, ArrayList<Integer> two){
//first array list
        ArrayList<Integer> firstList=new ArrayList<>();

//second array list
        List<Integer> secondList=new ArrayList<>();

//returns the common elements in both list
        firstList.removeAll(secondList);
        System.out.println(firstList);
        return firstList;
    }

}











package day40_arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());//just printing
        ArrayList<String>days = getDaysOfWeek();//making a reference to be able to use it later
        System.out.println(days.get(0)); //to print one element that I chose
        System.out.println(getDaysOfWeek().get(0));//it is same, different way
        System.out.println(printList(getDaysOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list));

    }

    public static String printList(ArrayList<String>list) {
        String str = "LIST: ";
        for (String each : list) {
            str += "\n*\t" + each;
        }
    return str;
    }

    public static ArrayList<String> getDaysOfWeek(){
        java.util.ArrayList<String >days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        )); //This format is to make it more readable
        return days;
    }


}

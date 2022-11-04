package GentritsCodes.Task5;

import java.util.ArrayList;
import java.util.Iterator;

public class T1_RemoveAhmed {

//    1. java.util.ArrayList -- Remove "Ahmed"
//    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//    Write a java operation to remove all the names named Ahmed.

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Buddy");
        names.add("Morty");
        names.add("Ahmed");

        System.out.println(names);
        names.remove("Ahmed");
        System.out.println(names);

        Iterator<String> it = names.iterator();

            while (it.hasNext()) { // checks if there is an element next to it, if not stop the loop
                if (it.next() == "Ahmed") { // move to the next element and then return it
                    it.remove(); // removing the element from the list
                }
            }
            System.out.println(names);

        }
    }
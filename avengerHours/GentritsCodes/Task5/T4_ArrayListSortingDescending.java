package GentritsCodes.Task5;

import java.util.ArrayList;

public class T4_ArrayListSortingDescending {

    //            4.ArrayList -- sorting in descending order
//    Write a method that can sort the ArrayList in descending order without using the sort method
//
//            (Keep in mind last 2  for sorting, dont use Sort method


    public static void main(String[] args)
    {
        ArrayList< Integer > list2 = new ArrayList <> ();

        list2.add(30);
        list2.add(50);
        list2.add(40);
        list2.add(20);

        for (int i = 0; i < list2.size(); i++) {

            for (int j = list2.size() - 1; j > i; j--) {
                if (list2.get(i) < list2.get(j)) {

                    int tmp = list2.get(i);
                    list2.set(i,list2.get(j)) ;
                    list2.set(j,tmp);
                }
            }
        }
        for (int i: list2) {
            System.out.print(i + " ");
        }

    }
}


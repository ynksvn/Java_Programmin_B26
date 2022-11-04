package GentritsCodes.Task5;

import java.util.ArrayList;

public class T3_ArrayListSortingAscending {

    //3. ArrayList -- sorting in ascending
//    Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static void main(String[] args) {
        //You can't directly assign value to ArrayList Index. You have to use the set() method. change your code as follow :

        ArrayList < Integer > list = new ArrayList <> ();
        list.add(10);
        list.add(5);
        list.add(4);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {

            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {

                    int tmp = list.get(i);
                    list.set(i,list.get(j)) ;
                    list.set(j,tmp);
                }
            }
        }
        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
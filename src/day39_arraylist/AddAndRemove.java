package day39_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0); //remove by index. It store the return calue into a String variable called as item
        System.out.println(item);
        System.out.println(list);

        list.remove("mouse");
        System.out.println(list);



    }
}

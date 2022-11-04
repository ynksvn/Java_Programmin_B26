package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 3.89);

        System.out.println("Store Inventory");

        //for (String key : store.keySet()){ returns the set of keys, then we use those keys to get information from the map
       // System.out.println("\nItem: " + key + " for $" +store.get(key)); // using the get method from the map to get the value that based on the key

        for (Map.Entry<String, Double> each : store.entrySet()){ //returns the entry(key/value pairs) from the map
            System.out.println("\nItem: " + each.getKey() + " for $" + each.getValue()); //getValue method is the method from the Entry, which gives value of the current entry

            //We got the price by get method, calling the class

            System.out.println(store.values()); // returns the values from the map as a collection type
            //key is my item

            Scanner input = new Scanner(System.in);
            System.out.println("What item do you want");
            String item = input.nextLine();

            System.out.println(store.containsKey(item)?item + " is in stock" : "Not available in this store");



        }


    }
}

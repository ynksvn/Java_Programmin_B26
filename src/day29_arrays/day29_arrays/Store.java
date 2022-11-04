package day29_arrays.day29_arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 299.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        //print the catalog

        for (int i =0; i<items.length; i++){

            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);

        }

       int indexOfGloves = -1; //what if we don't have it, start with -1 instead of assuming the first index = 0 is a valid index

        for (int i = 0; i< items.length; i++){
            if (items[i].equalsIgnoreCase("gloves")){
                indexOfGloves = i; // when it finds the gloves it will stop, it will be out the last i value
                break;
            }

        }
        System.out.println("Index of gloves " + indexOfGloves);

// Find the most expensive item and print the information
        double mostExpensive = prices[0];
        int indexOfExpensive = 0;

        for (int i =0; i< prices.length; i++) {
            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
                indexOfExpensive = i;

            }
        }
        System.out.println("The most expensive item is " );
        System.out.println("Item: " + items[indexOfExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfExpensive]);
        System.out.println("The price is "+ mostExpensive);
        }

    }



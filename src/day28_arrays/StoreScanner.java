package day28_arrays;

import java.util.Scanner;

public class StoreScanner {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "Ipad"};

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String item = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase(item)) {
                inStock = true;
                break;
            }
        }
        System.out.println(item + (inStock ? " item is in stock" : "item is out of stock"));

    }

}

package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which size would you prefer today?");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;


        switch (size){
            case "Tall":
                price = 2.50;
                calories = 100;
                break;
            case "Grande":
                price = 4.00;
                calories = 150;
                break;
            case "Venti":
                price = 4.50;
                calories = 200;

                break;
            default:
                System.out.println("Invalid order");
                validOrder = false;
        }

        if(validOrder) {
            System.out.println("Your order for " + size + " is will be for $" + price + " and has " + calories + " calories");
        }





    }
}

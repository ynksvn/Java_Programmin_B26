package day15_switch;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.\nPlease select one of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String selection = input.next();

        String item = "";
        boolean isValid = true;

        switch (selection) {
            case "Drinks":
            case "drinks":
                System.out.println("You chose drinks:\nPress a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    item = "water";
                } else if (drinkNumber == 2) {
                    item = "soda";
                } else if (drinkNumber == 3) {
                    item = "juice";
                }
                break;
            case "Snacks":
            case "snacks":
                System.out.println("You chose snacks:\nPress a number:\n\t1)Chips\n\t2)Candy\n\t3)Crackers");
                int snacks = input.nextInt();

                if (snacks == 4) {
                    item = "chips";
                } else if (snacks == 5) {
                    item = "candy";
                } else if (snacks == 6) {
                    item = "crackers";
                }
                break;
            case "Gum":
            case "gum":
                System.out.println("You chose gum:\nPress a number:\n\t1)Mint Flavor\n\t2)Lemon Flavor\n\t3)Watermelon Flavor");
                int gum = input.nextInt();

                if (gum == 7) {
                    item = "mint";
                } else if (gum == 8) {
                    item = "lemon";
                } else if (gum == 9) {
                    item = "watermelon";
                }
                break;
            default:
                System.out.println("Invalid choice");
                isValid = false;

        }
        if (isValid) {
        System.out.println("Your choice of " + item + " is ready to serve");


        }
    }
}
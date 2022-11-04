package day16_review;

import java.util.Scanner;

public class GiftCard {

        public static void main(String[] args) {
            //WRITE YOUR CODE BELOW
            Scanner input = new Scanner(System.in);

            System.out.println("Hello, which item would you like?");

            String item = input.next();
            int price = 0;
            int balance = 0;
            int giftCard = 100;
            boolean isAvailable = true;
            switch (item){
                case "Blanket":
                    price = 60;
                    balance = giftCard - price;
                    break;
                case "Charger":
                    price = 5;
                    balance = giftCard - price;
                    break;
                case "Hat":
                    price = 25;
                    balance = giftCard - price;
                    break;
                case "Headphones":
                    price = 30;
                    balance = giftCard - price;
                    break;
                case "Pants" :
                    price = 50;
                    balance = giftCard - price;
                    break;
                case "Laptop":
                    price = 200;
                    balance = giftCard - price;
                    break;
                case "Pillow":
                    price = 40;
                    balance = giftCard - price;
                    break;
                case "Smartphone":
                    price = 1000;
                    balance = giftCard - price;
                    break;
                case "Socks":
                    price = 5;
                    balance = giftCard - price;
                    break;
                case "USB cable":
                    price = 10;
                    balance = giftCard - price;
                    break;

                default:
                    System.out.println("Sorry, that is an invalid item");
                    isAvailable = false;

            }if (isAvailable) {
                if (balance > 0) {
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + balance + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");




                }
            }
        }
    }

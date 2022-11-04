package day08_relational_operators;

import java.sql.SQLOutput;

public class GiftCard {
    public static void main(String[] args) {

        double giftCard = 200;
        double item1 = 100.50;
        double item2 = 40;


        System.out.println("Buy item 1 for 100$");
        giftCard -= item1;
        System.out.println("Buy item 2 for 40$");
        giftCard -=item2;

        System.out.println("Your gift card balance is now: " + giftCard);


    }
}

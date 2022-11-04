package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have:" + apples);
        System.out.println("Grapes:" + grapes);
        System.out.println("Bananas:" + bananas);

        System.out.println("Sold some apples");
        apples = 30; /*you cannot declare same variable twice, thats why you cannot use int here
                       resigning apples to have value of 25*/

        System.out.println("Apples after selling: " + apples);

        int price = 15;
        int p2 = 20;
        price = p2;
        System.out.println(price);
        System.out.println(p2);


        System.out.println("The price of my 25 apples is $20");
        System.out.println("The price of my " + apples + "apples is $" + price); //* hard coded = it is in the code

        System.out.println("A" + (0 + 1));
        System.out.println("A" + (0) + (1));





    }
}

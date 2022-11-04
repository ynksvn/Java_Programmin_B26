package day09_scanner;
import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = input.nextDouble();
        System.out.println("Enter the price of the item ");

        int quantity = input.nextInt();
        System.out.println("Enter the quantity ");

        double revenue = price * quantity;
        System.out.println("The revenue is $" + revenue);
                         /*("The revenue is $" + (price * quantity));
                           ("The revenue is $" + (scan.nextDouble() * scan.nextInt)));*/








    }
}



/* Write a program that asks the user to enter a price and quantity and then
calculate the revenue. revenue = price Ã— quantity.*/

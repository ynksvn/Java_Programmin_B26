package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Hit enter after each");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println();

        System.out.println("The total of numbers are " + (num1 + num2 + num3));

    }
}

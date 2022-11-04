package day10_scanner_practice;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = input.nextInt();

        boolean isLEapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0);

        System.out.println(isLEapYear);
    }
}

package day20_IndexOfExample;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String firstname = input.next();
        System.out.println("Enter your last name");
        String lastname = input.next();

        firstname = firstname.trim().toLowerCase();
        lastname = lastname.trim().toLowerCase();

       String fixedFirst = firstname.substring(0,1).toUpperCase(); // to make the first letter in uppercase
        fixedFirst += firstname.substring(1); // 1 is my starting number/point

        String fixedLast = lastname.substring(0,1).toUpperCase() + lastname.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);

    }
}

package day09_scanner;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");
       String firstName = input.next();
        System.out.println("Enter your last name ");
        String lastName = input.next();
        System.out.println("Are you Employed: ");
        boolean isEmployed = input.nextBoolean();
        System.out.println("Are you a student: ");
        boolean isStudent = input.nextBoolean();

        String details = firstName + "" +  lastName + " is employed " + isEmployed + " and is a student " + isStudent;
        System.out.println(details);



    }
}

package day29_arrays.day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String [] bankOne = {"Brad Smith", "Checking" , "100219482", "100.000.000"};

        System.out.println(bankOne.length);
        System.out.println("Whole Array " + Arrays.toString(bankOne));
        System.out.println("Name: " + bankOne[0]);
        System.out.println("Account type: " + bankOne[1]);
        System.out.println("Account number: " + bankOne[2]);
        System.out.println("Balance " + bankOne[3]);

        String [] bankTwo = new String [4];
        System.out.println(Arrays.toString(bankTwo));
        bankTwo [0] = "Jamie Fox0;";
        bankTwo [1] = "Savings";
        bankTwo [2] = "130484192";
        bankTwo [3] = "10203324";
        System.out.println(Arrays.toString(bankTwo));

        String [] bankThree = new String [4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        bankThree [0] = fullName;
        System.out.println("Enter your account type");
        bankThree [1] = input.nextLine();
        System.out.println("Enter your account number");
        bankThree [2] = input.nextLine();
        System.out.println("Enter your balance");
        bankThree [3] = input.nextLine();
        System.out.println(Arrays.toString(bankThree));

        String [] bankFour = new String[4];
        String [] questions = {"full name" , "account type", "account number" , "balance"};

        for (int i =0; i<bankFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            bankFour [i] = input.nextLine();
        }
        System.out.println(Arrays.toString(bankFour));





    }


}

package day14_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode:");
        int actualPin = input.nextInt();;
        System.out.println("Please enter four digit of your SSN:");
        int actualSSN = input.nextInt();;

        //boolean validPin = actualPin == expectedPin
        //boolean validSSN = actualSSN == expectednSSN

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if(actualPin == expectedPin && actualSSN == expectedSSN) { //if(validPin && validSSN)
            System.out.println("Authentication successful");

        }else{
            if (actualPin != expectedPin && actualSSN != expectedSSN){ // just sout
                System.out.println("Authentication failed");

                if(actualPin != expectedPin){                       //if(!validPin)
                    System.out.println("incorrect pin code");
                }
                    if(actualSSN != expectedSSN){                  //if(!validSSN)
                        System.out.println("incorrect SSN");
                    }
                }



        }



    }
}

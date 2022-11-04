package day11_if_statement;


import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature of today");
       // int temperature = 150;
        int temperature = input.nextInt();


        if (temperature >=70){
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop");
        }else{
            System.out.println("It is too cold");
        }





    }
}

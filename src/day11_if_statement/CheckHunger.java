package day11_if_statement;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry? True or False?");

        boolean isHungry = input.nextBoolean();
        // boolean isHungry = true;
        if (isHungry){
            System.out.println("You are hungry, so I will get some food for you");
        }else{
            System.out.println("Great");
        }
    }
}

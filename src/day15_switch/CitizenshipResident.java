package day15_switch;

import java.util.Scanner;

public class CitizenshipResident {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you a resident?");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if((isCitizen || isResident) && hasDiploma && (age >= 18 && age <= 35)){
            System.out.println("You are qualified for the Army");
        }else{
            if(!isCitizen && !isResident){ // !(isCitizen || isResident)
            System.out.println("You are not qualified for the Army");
        }
            if (!hasDiploma){
                System.out.println("High school diploma is required");
            }
            if (age<18 && age>35){
                System.out.println("Your age must be between 18 to 35 years old");
            }
            }

    }
}

package day16_review;

import java.util.Scanner;

public class computer {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            double finalPrice = 0;


            System.out.println("Select screen size:");
            String screen = input.next();
            int totalPrice = input.nextInt();

            System.out.println("Select CPU type:");
            String cpu = input.next();


            System.out.println("Select RAM size:");
            String ram = input.next();
            int ramSize = 0;


            System.out.println("Select storage type:");
            String storageType = input.next();

            System.out.println("Select storage size:");
            int storageSize = input.nextInt();


            System.out.println("Select screen resolution:");
            String screenRes = input.next();


            switch (screen) {
                case "13.3":
                    totalPrice += 200;
                    break;
                case "15.0":
                    totalPrice += 300;
                    break;
                case "17.3":
                    totalPrice += 400;
                    break;
            }


            switch (cpu) {
                case "i3":
                    totalPrice += 150;
                    break;
                case "i5":
                    totalPrice += 250;
                    break;
                case "i7":
                    totalPrice += 350;
                    break;
            }

            switch (ram) {
                case "RAM":
                    if (ramSize % 4 == 0) {
                        totalPrice += (ramSize / 4) * 50;
                    }
            }

            switch (storageType) {
                case "HDD":
                    totalPrice += 50 * (storageSize / 500);
                    break;
                case "SSD":
                    totalPrice += 100 * (storageSize / 500);
                    break;

            }


            switch (screenRes) {
                case "FULLHD":
                    totalPrice += 100;
                    break;
                case "4K":
                    totalPrice += 200;
                    break;

            }


            System.out.println("Final price is: $" + finalPrice);


        }
    }




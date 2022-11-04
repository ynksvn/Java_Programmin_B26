package day03_office;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of them\n\tList of rooms\n\t\tBedroom\n\t\tKitchen");
        String roomType = input.nextLine().toLowerCase();

        boolean isValid = roomType.equals("bedroom") || roomType.equals("bedroom");
        double area = 0;
        double unitPrice = 3.92;


        if (isValid) {
            System.out.println("Calculating...");

            switch (roomType) {
                case "bedroom":
                    System.out.println("Please enter your " + roomType + " dimensions");
                    double width = input.nextDouble();
                    double length = input.nextDouble();
                    area = width * length;
                    break;
                case "kitchen":
                    System.out.println("Please enter your " + roomType + " dimensions");
                    double radius = input.nextDouble();
                    area = radius * 3.14;
                    break;

            }
                double totalCost = unitPrice*area; // this should be after area calculation to receive a valid value
             input.nextLine(); // to clear the scanner memory
                        System.out.println("Please enter your address");
String address = input.nextLine();
                System.out.println("TotalCost for your carpet is " + totalCost + " and it will be delivery " + address + " in one week");

            }else{
                System.out.println("Invalid Room type");
            }


        }
    }

        /*
         - Ask the user which room do they need carpet? (String)
                            			List of Rooms
                            				Bedroom
                            				Kitchen

                            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 47.04 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
                                     */




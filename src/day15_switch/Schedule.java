package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about");
        String day = input.next();
        String information = "";


        switch (day) {
            case "Monday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "Tuesday":
            case "Wednesday":
                information = "We have Java with Saim at 7 pm EST, and also we have office at 5:30 pm";
                break;
            case "Thursday":
                information = "We have Soft Skills with Nadir at 7 pm EST";
                break;
            case "Friday":
                information = "Today is day off or as Nadir says study day";
                break;
            case "Saturday":
            case "Sunday":
                information = "We have full day of Java with Saim at 10 am to 5 pm EST";
                break;
                default:
                information = "Not a valid day";
        }

        System.out.println(information);




    }
}

package day15_switch;

import java.util.Scanner;

public class Browser_scanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = input.nextLine();
        System.out.println("Enter your url");
        String url = input.nextLine();

        switch (browser) {
            case "Chrome":
            case "chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in safari");
                System.out.println("Loading");
                break;
            case "Firefox":
                System.out.println("Opening" + url + " in firefox");
                break;
            default:
                System.out.println(browser + " is not a valid");
        }


    }
        }

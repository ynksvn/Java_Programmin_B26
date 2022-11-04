package day33_methods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }
    public static void getReadyToGo (){
        System.out.println("Putting on seatbelt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Turn on navigation");
    }
    public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forwards");
    }

    public static void hurry(){
        unlockCar();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        unlockCar();
        openDoor();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();

        System.out.println();

        hurry();
        System.out.println("hear police siren");
        getReadyToGo();


    }
}
/*
unlock thecar
open the door
sit in the car
close the door
put on seatbelt
start the engine
put into drive and go
 */
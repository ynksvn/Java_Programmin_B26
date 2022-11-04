package day43_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    int fuel;

    public void drive(){
        System.out.println("Driving " + model);
        fuel -=5;

    }

    public void fillTank(){
        System.out.println("Filling the tank");
        fuel = 100;
    }
    public boolean isLow(){
        return fuel<25;

    }

    public String toString(){
        return  "Model: " + model+ "\nYear: " + year + "\nColor: " + color + "\nFuel Level: " +fuel + " \n" + (isLow() ? "Tank is low" : "Keep on driving" );

}

}


 /*
    Create a class Car

create instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */
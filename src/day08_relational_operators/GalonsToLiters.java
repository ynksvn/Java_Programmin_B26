package day08_relational_operators;

public class GalonsToLiters {
    public static void main(String[] args) {
        int gallon = 1;
        double liters = 3.78541;

        gallon = 10;
        liters *=gallon;
        System.out.println(gallon + " gallons equal to " + liters + " liters");

        gallon = 20;
        liters *= 2;
        System.out.println(gallon + " galons equal to " + liters + " liters");
    }
}
/*create a class called GalonsToLiters, and write a program that can convert
the gallons to litters
Ex:
gallon = 10;
output:
10 gallons equal to 37.8541 liters
gallon = 20
output:
20 gallons equal to 75.7082 liters*/
package day08_relational_operators;

public class KgToPounds {
    public static void main(String[] args) {

        int kg = 1;
        double pound = kg * 2.20462;
        System.out.println(kg + " kg is equal to " + pound + " pounds");

        kg = 10;
        pound *= kg;
        System.out.println(kg + " kg equal to " + pound + " pounds");

        kg = 20;
         pound *= 2;
        System.out.println(kg + " kg equal to " + pound + " pounds");

    }
}
/* create a class called KgTopounds, and write a program that can convert Kg
to pound and print the result
Ex:
kg = 10;
output:
10 kg equal to 22.0462 pounds
kg = 20
output:
20 kg equal to 44.0924 pounds
....
Hint: 1kg = 2.20462 pounds */
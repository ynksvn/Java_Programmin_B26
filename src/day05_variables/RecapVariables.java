package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        //We can't print the variables because they don't have a value
  //      System.out.println(numberOfCoffeeCups);
  //      System.out.println(totalPriceOfCoffee);
  //      System.out.println(totalStudentInClass);


        // Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        System.out.println("numberOfCoffeeCups " + "*" + totalStudentInClass);
        System.out.println(numberOfCoffeeCups + "* " + totalStudentInClass);

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " in java class at " + temperature + " with " +totalStudentInClass + " students");






    }
}

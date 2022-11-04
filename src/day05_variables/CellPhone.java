package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

       String brand = "Apple";
       String model = "Iphone 10";
       String color = "Black";
       double price = 1000.99;
       int storage = 128;
       boolean hasCamera = true;
       char sim = 'A';


        System.out.println(brand + " " + model + " " + color + " " + price + " " + storage + " " + hasCamera + " " + sim);
        System.out.println(" I have an " + model + " from " + brand);
        System.out.println("My phone is " + color + " and " + "$" + price);
        System.out.println("It has " + storage + " and " + hasCamera + " with " + sim);


//approach 2 with String variable

        String fullMessage = "I have an " + model + " from " + brand + "\nIt came in the color " + color + " and it has " + storage + "GB \nFor the sim type" + sim + " with a camera" + hasCamera + " the total price was $" + price;

        System.out.println(fullMessage);

        System.out.println(fullMessage);
    }
}

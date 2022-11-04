package day42_custom_classes;

public class Coffee {
    String brand;
    String type;
    double price;
    double size;

    public String toString(){
        return type+ " from " + brand + " size of " + size + "oz. For a total price of " +price;
    }
    public void drink(){
        System.out.println("Drinking " + type);
        size -=1.5;
    }
    public void refill(double amount){
        System.out.println("Refiling " + amount + " oz of coffee");
        size += amount;

    }





}
/*
Create a coffee class with these instance variables:
brand, price, size(oz), type

instance methods:

make a toString to print all the information of the coffee subject

drink:print trying of coffee

refill -amount in oz : print refilling * oz - add the number of oz to the total size
 */
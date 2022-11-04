package day44_custom_classes;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


    public Food(String name){
        this.name = name;
    }
    public Food(String name, int quantity){
        this(name);
        this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice){
        this(name, quantity); // the parenthesis can be only on the first line
        this.unitPrice= unitPrice;
        calculatePrice();
    }
    public void calculatePrice(){
        totalPrice = quantity*unitPrice;


    }

public String toString(){
        return "Item: " + name + " - " + quantity + " x " + unitPrice + " for $" + totalPrice;
}
}

/*
 create a class called Food

        - data:

            name, quantity, unit price, total price

        - constructor

            - create a constructor that creates a Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

        - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20

--------------------------------------------------------------------------------

Make a class for Employee objects (from class)

    try to make an ArrayList of Employee objects
    maintain the list to have all the Employees that are SDET or Developer
    maintain a separate list of all the Employees who make over 100,000 salary
    find the max salary from the Employees

--------------------------------------------------------------------------------

Make a class for Offer objects (from class)

    try to create 7 objects of Offer class and store them into an ArrayList of Offer
       maintain the list to keep the offers from your local area
    maintain the list to to keep only full time offers
 */

package day45_custom_classes_Array;

import java.util.Arrays;

public class Store {
     /*
        Create a separate class to create and test the Food objects
        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
     */

    public static void main(String[] args) {

        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays", 2);
        System.out.println(chips);
        chips.unitPrice = 1.99;
        chips.calculatePrice();

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        System.out.println(apples); //manually variables assigned. We didn't switch the constructors

        apples.calculatePrice(); //after i call the method it will be do the totalPrice
        System.out.println(apples);
        System.out.println(apples.totalPrice);


        String [] strs = {"one" , "two", "three"};
        //the elements are object type

        //To store my food objects into the Array
        Food [] allFood = {apples, chips, chicken, null};
        System.out.println(allFood[2]);
        //new Food[4] can be also done

        allFood[3] = new Food("cherry", 4, 3.55);
        //add a new food object with constructor, reassigned the null

        //To print the array
        System.out.println(Arrays.toString(allFood));

        //calculate the total price of the shopping list

        System.out.println();

        double totalAll = 0;

        for (Food each : allFood){
            //the data type of this element is Food type
            //To reach out the ArrayList
            //iterate through the ArrayList
            System.out.println(each);
            totalAll += each.totalPrice;
        }
        System.out.println(totalAll);













    }





}

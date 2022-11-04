package day44_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays" ,2 );
        System.out.println(chips);
        chips.unitPrice = 1.99;
        chips.calculatePrice();

        Food candy = new Food ("Candy" , 3 , 5.99);
        System.out.println(candy);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);
        System.out.println();

        String [] str = {"one", "two", "three"}; // did it an example. it is for comparison

        Food [] allFood = {apples, chips , candy, null};
        System.out.println(allFood[2]);
        System.out.println();
        allFood [3] =new Food("Fish", 4 , 3.55);
        System.out.println(Arrays.toString(allFood));
        System.out.println();

        //To calculate the total price of the shopping list

        double totalPriceAll = 0;

        for (Food each: allFood){ // the traditional way : each== allFood[i]
            System.out.println(each); //this is not a necessary step. we did to see the flow

          totalPriceAll+=  each.totalPrice;
        }

        System.out.println(totalPriceAll);





    }
}
 /*
        Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
     */
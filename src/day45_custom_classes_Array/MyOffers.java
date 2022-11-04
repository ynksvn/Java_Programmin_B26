package day45_custom_classes_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Florida", 150.000, true, 20);
        System.out.println(first);


//Creating an Arraylist that will Offer objects
        ArrayList<Offer>allOffers = new ArrayList<>();

        allOffers.add(first); //added the first Offer object to the Arraylist
        System.out.println(allOffers);

        allOffers.add(new Offer("Amazon", "New York", 180.000, true, 20)); // creating an Offer object and added to the AraayList
        System.out.println(allOffers);

        Offer [] moreOffers = {
                new Offer("Apple", "Florida", 120.000, true, 15),
                new Offer("WorldWide", "St Louis", 80.000, false, 10),
                new Offer("Mastercard", "St Louis", 120.000, true, 15)
        }; //created an array of Offer objects

        allOffers.addAll(Arrays.asList(moreOffers)); // added the array of Offers into the ArrayList of offers
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer ("Dicord", "Chicago", 150.000, false,13),
                new Offer("Netflix", "Canada", 170.000, true, 10)
        ));
//added Offer objects using the var args of the asList method to add multiple Offer object at the same time

        //To create an element from the ArrayList
        //create ArrayLists to filter the Offers

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        //making a  copy of the Arraylist to edit

        salaries.removeIf( each -> each.salary<130_000);
        System.out.println(salaries); //it will print me the offers in this range
        System.out.println();

        ArrayList<Offer>fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime);
        System.out.println("Print only full time offers");
        System.out.println(fullTime);



    }
}

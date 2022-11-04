package day44_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        //offer object:

        Offer first = new Offer("Google", "Florida", 200_000, true, 15);
        System.out.println(first);

        //How to make an object with Array list
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first); // added the first subject to arraylist
        System.out.println(allOffers);

        allOffers.add(new Offer("Amazon", "New York", 180_000, true, 15));


        System.out.println(allOffers);

        Offer [] moreOffers = {
                new Offer("Apple", "New York",230_000, false, 30),
                new Offer("Tesla", "Florida", 250_000, false,20),
                new Offer("Facebook", "St Louis", 120_000, true, 20)
        }; //created an array of Offer Objects

        allOffers.addAll(Arrays.asList(moreOffers));
        //added the array of Offers into the ArrayList of offers
        System.out.println(allOffers);

        //added Offer Objects using the var args of the asList method to add multiple Offer Objects at the same time
        allOffers.addAll(Arrays.asList
                (new Offer("Discord", "South Carolina", 150_000, false, 20),
                new Offer("Netflix", "California", 220_000, true, 35)

        ));

        //create ArrayList to filter the Offers
        System.out.println();
        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf(each -> each.salary < 170_000); // Offer java file has to be under the same class to be able refer salary variable
        System.out.println("Salaries above 170_000");
        System.out.println(salaries);

        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime);

        System.out.println("Only full time offers");
        System.out.println(fullTime);










    }
}

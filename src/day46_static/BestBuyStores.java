package day46_static;

import java.util.Objects;

public class BestBuyStores {
    public static void main(String[] args) {

//accessing the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);

        //accessing the instance variable
        BestBuy store1= new BestBuy("Oak Drive");
        System.out.println(store1.location);
        System.out.println(store1.numberOfComputer);
        //objects can access to static variables. But it is not preferable, because it belongs to class level

        store1.numberOfComputer--; // static variable.
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store2 = new BestBuy("Main St");

        store2.numberOfComputer -=5; //static variable
        System.out.println(store1.numberOfComputer);
        //there is only copy of static variable, So our result will be 94 (100-6). It belongs to BestBuy class, it will subtract from static variable
        System.out.println(BestBuy.numberOfComputer);

        store2.location = "Fairfax"; //location belongs to instance object. It will only affect store 2
        System.out.println(store2.location);
        System.out.println(store1.location);

        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComputer);
        store1.reStock(); //it is static variable, belongs to all class
        System.out.println(BestBuy.numberOfComputer);

        //BestBuy.openStore(); -> I cant call the instance variable by the clas name. I have to have object
        store1.openStore(); //it doesnt affect each other because they are different object
        store2.openStore();

    }
}

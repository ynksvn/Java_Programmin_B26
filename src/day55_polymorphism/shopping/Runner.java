package day55_polymorphism.shopping;

import day52_inheritance.hiding.A;

public class Runner {
    public static void main(String[] args) {
        Target target = new Target();
        target.price =10;
        target.buyItem();
        target.returnItem();
     //   target.payForShipping(true); Target class does not implement the Shipping interface

        System.out.println();

        Amazon amazon = new Amazon();
        //price is instance variable
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();


        System.out.println(amazon.country);
        System.out.println(Shipping.country); // country is static variable. ot is proper way to access static information in the interface
    }
}

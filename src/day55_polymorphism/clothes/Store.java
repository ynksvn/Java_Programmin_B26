package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        //All possible objects of tshirt

        //reference of itself
        Tshirt tshirt1 = new Tshirt();
        tshirt1.wear();

        //reference of parent
        Clothes tshirt2 = new Tshirt();
        tshirt2.wear();

        Object tshirt3 = new Tshirt();
        //tshirt3.wear();
//Object class does not have reference to the wear() methd even though it is a valid reference. It is a base class of parent class - parent class of all the classes

       // HasHood tshirt4 = new Tshirt();
        //tshirt did not implement to hashood interface.
        //tshirt doesnt have any relation with hashood. If we implement the tshirt than it could be implemented

        //reference of itself
        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        //parent class reference

        Clothes jacket2 = new Jacket();
        jacket2.wear();
       // jacket2.putOnHood(); it doesnot have access to putonHood


        Object jacket3 = new Jacket();
//        jacket3.wear(); Object class doesnt have reference to those methods
//        jacket3.putOnHood();



        HasHood jacket4 = new Jacket();
       // jacket4.wear(); it doesnt have access to wear method
        jacket4.putOnHood();



    }

    //same class, different method

    public static void buy(Clothes clothes){
        if (clothes instanceof Tshirt) {
            System.out.println("Bought Tshirt");
        }else if(clothes instanceof Jacket){
            System.out.println("Bought a cool Jacket");
        }

    }







}

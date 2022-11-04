package day46_static;

public class BestBuy {

    String location; // it is an instance variable

    static String headquarters = "Richfield, Minnesota, United States";
    static String day = "Wednesday";
    static  int numberOfComputer = 100;

    public BestBuy (String location){ //the constructor
        this.location = location;
    }

    public void openStore(){
        System.out.println("Openning the " + location);
    }

    public static void reStock(){ //static method
        numberOfComputer +=20;
    }




}

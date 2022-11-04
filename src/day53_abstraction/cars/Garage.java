package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {

        //Car obj1 = new Car(); - car is abstract, we cannot make an object of the class

        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();


        Tesla obj4 = new Tesla();
        obj4.charge();
        obj4.start();


    }
}

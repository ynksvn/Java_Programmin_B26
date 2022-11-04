package day56_polymorphism.book;

import java.beans.DesignMode;
public class Car {

    class BMW extends Car { }

    class Tesla extends Car {}

    class Toyota extends Car {}

    class Ford extends Car{}

    class LandRover extends Car {}

    static class Dealership {

        public static void lease(Car car) {
            System.out.println("Leasing a car " + car.getClass().getName());
        }

    }

     class Runner {
        public void main(String[] args) {
            Car car = new Car();
            Dealership.lease(car);

            Tesla tesla = new Tesla();
            Dealership.lease(tesla);

            Dealership.lease(new LandRover());

            Dealership.lease(new Toyota());
        }
    }
}

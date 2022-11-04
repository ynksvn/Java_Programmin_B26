package day43_custom_classes;

import com.sun.security.jgss.GSSUtil;

public class UsingCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);
        car1.model = "Chiron Bugatti";
        car1.year= 2022;
        car1.color = "Red";
        car1.fuel= 80 ;

        System.out.println();

        System.out.println(car1);

        System.out.println();
        car1.drive();
        car1.drive();
        System.out.println(car1.fuel);

        System.out.println();

        car1.fillTank();
        System.out.println(car1.fuel);


    }
}

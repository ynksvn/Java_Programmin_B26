package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App(); // created instance object
        cydeo.name = "Cydeo";  //accessed the instance variable
        cydeo.version = 5.5;
        cydeo.isFree = true;

      //it doesnt work =  System.out.println(App.run());
        // we can't call instance methods like this - App.run();

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo); // it gives a number. - it is not an object

        new App().run(); //not very useful, but we can write like this
        //this creates an object with no reference and calls the run method
        new Scanner(System.in).nextLine();
        //no scanner object to use






    }
}

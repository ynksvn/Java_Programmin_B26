package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World"); // this is not part of the static class. it is part of the main method.
        Computer comp = new Computer("HP", 500, "Silver");
        // This will print :
        //Static block run

        // Static belongs to class not to the object. Static block and variable do not have to run together. When the class it used, then static block runs. Static blocks are attached to the class

        System.out.println(Computer.hasBattery); //it prints true
        //this is a variable. to be able to see it on console, we have to print-calling the static variable (class.variableName)

        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);
        //it doesn't affect the code.
        // it is instance variable. class name + instance = invalid
        //        //to access individual instance variable , we can call object name and then instance variable name it belong to, but in general we should have toString() in our custom Class, to access our object.


        System.out.println(comp.brand);
       //System.out.println(Computer.brand);
        // This will give error because it is string variable. We can't call it by the class. We have to use the object

        System.out.println(comp.hasMemory);
        //it works. It can be accessed static members from an object reference bevause the Object comes from the class. but it doesn't recommend to use like this. It is preferred to access static members by the class







    }
}

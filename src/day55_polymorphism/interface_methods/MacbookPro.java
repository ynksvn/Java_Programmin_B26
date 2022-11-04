package day55_polymorphism.interface_methods;

public class MacbookPro implements Mac{


    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }
}

class Runner { // a new class in the same file, not related to each other
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        //   System.out.println(MacbookPro.NAME);
        //   System.out.println(MacbookPro.OS); //References are different but they are same. Call by interface. You can access the static variables from the child class reference but you should use the interface to access

        Mac.company(); //called static method to implement
       // Mac.facetime(); // this is not valid. it is not a static method, it is a default method and need an object. It is instance. IT needs to be called from the object

        //   Mac.turnOn(); // this is instance, not valid. I need an object to call this method


        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();






    }
}
package day55_polymorphism.interface_methods;

public interface Mac {

    String NAME = "Mac"; //public static final variable
    String OS = "IOS"; // it is constant, so it is uppercase

    void turnOn(); //public abstract method- it is a method without implementation

    //How do you create a method with implementation in an interface
    //One way is a static method:

    static void company(){  //public by default, not necessary to add it
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println("New release in November");

    }

    //The other way is the default method

    public default void faceTime(){//it needs code body/implementation
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }



}

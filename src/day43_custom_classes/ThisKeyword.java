package day43_custom_classes;

public class ThisKeyword {

    int a = 100; //instance variable


    public ThisKeyword(int a){ //constructor class with parameter
        a = 400; //This is the local value
        System.out.println(a);
        this.a = 600; // this is a keyword, that allows me to reference to the objects. I can access to instance variable.

    }

}

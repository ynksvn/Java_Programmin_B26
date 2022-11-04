package day56_polymorphism.book;
/*
Create an abstract class Book
    -Declare a name variable
    -Declare an abstract methods"
        read();
 */

public abstract class Book  { //make this abstract too so it will not give error

    String name;

    public abstract void read();
    //We made a instance variable name and the abstract class. If we have an abstract class we can't make an object

}

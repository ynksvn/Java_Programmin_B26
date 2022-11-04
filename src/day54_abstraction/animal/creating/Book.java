package day54_abstraction.animal.creating;

public class Book implements Create {
    // from interface to class, we use implements keyword.needs to override the methods
    // it is my concrete class

    @Override
    public void read() {
        System.out.println("Reading the book");

    }

    @Override
    public void write() {
        System.out.println("Writing the book");

    }
}

//none abstract class inheriting an abstract parent
// An abstract class allows you to create functionality that subclasses can implement or override. An interface only allows you to define functionality, not implement it. And whereas a class can extend only one abstract class, it can take advantage of multiple interfaces.
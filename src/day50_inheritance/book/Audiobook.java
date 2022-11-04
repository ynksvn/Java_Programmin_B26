package day50_inheritance.book;

public class Audiobook extends Book{

    double duration;
    String narrator;


public void listen(){
    System.out.println("Listening to " + title + " narrated by " + narrator);
}
}

// AudioBook is child of the Book

/*
Create a class AudioBook

    - AudioBook class inherits Book class

    - create additional variables:
        duration, narrator

    - create method:
        listen()
            Example output: prints listening to $title narrated by $narrator
 */
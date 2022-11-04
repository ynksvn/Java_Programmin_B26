package day56_polymorphism.book;
/*
  Create a concrete class
      - Inherits EBook
      - Declare a fun variable
      - Override all abstract methods
   */
public class JavaTextBook extends Ebook{

    boolean fun; //after we implement all the abstract methods that came from parent class, we should override

    @Override
    public void read() {
        System.out.println("Reading java textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading java textbook");
    }

    @Override
    public void open() {
        System.out.println("Opening java text book");
    }
}

package day56_polymorphism.book;

import day50_inheritance.book.EBook;

public class Library {
    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook(); //reference itself
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

       Ebook book2 = new JavaTextBook();
        book2.name = "Java Programming";
        book2.size = 20.5;
        //book2.fun = true; -> Ebook does not have access to the fun variable
        ((JavaTextBook)book2).fun = true; //downcasting
        //the reference from the parent Ebook to the child reference of Javatextbook and that allows us to access the fun variable
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextBook();
        book3.name = "Java Programming";
      //  book3.size = 20.5;
        //book3.fun = true;
        book3.read();
        //book3.open(); in the ebook
        //book3.download(); // in the download
        // the book reference only has access to the name variable and the read variable

        Downloadable book4 = new JavaTextBook();
      //  book4.name = "Java Programming";
       // book4.size = 20.5;
        //book4.fun = true;
      //  book4.read();
        // book4.open();
        book4.download();
        //The only thing accessible by the interface is the download method

       JavaTextBook book5 = (JavaTextBook)book4; //it is not a new object. it is the changing the reference with casting
       //upcasting
        //book4 was interface reference. We cast the reference to be a JavaTexkBook and assigned it to the book5 reference
      book5.read();
      book5.open();
      book5.fun = true;
      book5.size = 5;
      book5.name = "Java";











    }
}

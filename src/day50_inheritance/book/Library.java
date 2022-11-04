package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {
        //this is our running class

        Book obj1 = new Book();
        //obj1 will have access to 6 instance variables

        Audiobook  obj2 = new Audiobook();
        //obj2 will have access to 6 instance variables from the Book class and 2 new variables from the Audiobook class
        obj2.duration = 100;
        obj2.narrator = "Someone cool";
        //obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        obj3.size = 20.4;
        obj3.pages = 1004;
        obj3.title = "Soft Skills";
        obj3.read();

        //using the updated Author information

        Book obj4 = new Book();
        obj4.author = new Author("Irvin Yalom", 90);
        //made an Author object it belongs to the Book obj4 object // instance variable reference
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

        //Author author = new Author(); this is an Author object in the main method
        //Both cases we make an object for author cases. The difference is reference. Line 27, the reference belongs to Book class.



    }
}

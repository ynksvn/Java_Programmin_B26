package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {


      //this will not work:  System.out.println(name)
        // this will not work: System.out.println(Person.name) Not a valid way to access instance variables

        Person user1 = new Person();
        //creates an object of the Person class- so we can access to variables in the People class
        Person user2 = new Person();

        //To access the instance variables:
        user1.name = "James";
        user1.age = 40;
        user1.height = 5.10;
        user1.isMarried = true;

        //printing the instance

        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.height);
        System.out.println(user1.isMarried);

        //user2


        //printing the instance

        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.height);
        System.out.println(user2.isMarried);

        //it will print as null








    }
}

package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        System.out.println(name.equals("james")); // how to compare String values for all string types


        System.out.println("cat".equals("dog")); //"" shows that it is String

        System.out.println("hello world");

        System.out.println(name.equals("James"));
        System.out.println();

        System.out.println(name.equalsIgnoreCase("James"));
        System.out.println(name.equals("James"));

        String a= new String("hello");
        String b = new String("hello");
        System.out.println(a.equals("b")); // compares keyboard objects
        System.out.println(name.length());

        System.out.println(a.equals("hello")); //compares literal objects

        System.out.println(a.equals("java"));

String last ="today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));


    }
}

package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java";

        String second = new String("java");

        System.out.println(first == second);

String third = "java";
        System.out.println(first == third);

        String fourth = "Java";

        System.out.println(first == fourth);

        first = first.toUpperCase();
        System.out.println(first);

    }
}

package day23_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));


        System.out.println("with loop");

        for (int i = 0; i< s.length(); i++){ // i<=s.length() -1 is can also apply = both are same
            System.out.println(s.charAt(i));
        }
    }
}

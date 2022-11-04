package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {


        System.out.println("First Line");

        try {
        String word = "java";

        System.out.println(word.charAt(100));

        }catch (Exception e){
            String word = "java";

            System.out.println("Exception happened");
        }


        System.out.println("Last Line");
    }
}

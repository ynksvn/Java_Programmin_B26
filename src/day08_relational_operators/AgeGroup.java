package day08_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        // kid - up to 13, include 13
        // elder - 65 and above

        int age = 13;
        boolean isKid = age < 13;
        boolean isElder = age >= 65 ;
        System.out.println("You are a kid: " + isKid);
        System.out.println("You are a senior citizen: " + isElder);






    }
}

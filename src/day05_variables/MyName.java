package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letterOne = 'Y';
        char letterTwo = 'A';
        char letterThree = 'N';
        char letterFour = 'K';
        char letterFive = 'I';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);

        System.out.println(letterOne + "" + letterTwo + "" + letterThree + "" + letterFour + "" + letterFive);
        System.out.println("chars =" + letterOne + letterTwo + letterThree + letterFour + letterFive);
        System.out.println("My name:" + letterOne + letterTwo + letterThree + letterFour + letterFive);

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive;
        System.out.println("My name: " + name);


    }
}

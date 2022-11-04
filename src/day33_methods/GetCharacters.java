package day33_methods;

public class GetCharacters {

    public static void letters() {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void lowerLetters() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void zaLowerCase() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void zaUpperCase() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void numbers(){
        for (int i = 1; i<10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        letters();
        lowerLetters();
        zaLowerCase();
        zaUpperCase();
        numbers();
    }
}

    /*

        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9

     */
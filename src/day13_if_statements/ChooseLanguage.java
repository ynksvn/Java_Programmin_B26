package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please choose the language: \n1 = English \n2 = Spanish \n3 = Turkish \n4 = Russian \n5 = French");
        int option = input.nextInt();

        String message;

        if(option == 1){
            message = "Hello, thank you for your call";
        } else if (option == 2){
            message = "Hola, gracias para llamar";
        } else if (option == 3){
            message = "Merhaba, aradiginiz icin tesekkurler";
        } else if (option == 4){
            message = "Privet, spasibo za vash zvonok";
        } else if (option == 5){
            message = "Merci, pour votre appel";
        } else {
            message = "We will use English by default";
        }
        System.out.println(message);
    }
}

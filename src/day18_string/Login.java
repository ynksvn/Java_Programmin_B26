package day18_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a username");
        String username = input.next();
       username = username.toLowerCase();
        System.out.println(username);

        System.out.println("Enter a password");
        String password = input.next();


       if (password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("logged in with " + username);
}else{
            System.out.println("Invalid password");
        }






    }
}

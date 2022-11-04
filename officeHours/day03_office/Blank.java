package day03_office;

import java.util.Scanner;

public class Blank {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int result = 0;

        while (n > 0) {
            result *= n;
            result++;

        }
        System.out.println(result);
    }
}

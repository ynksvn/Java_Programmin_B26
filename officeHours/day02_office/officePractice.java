package day02_office;

import java.util.Scanner;

public class officePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt() + 1;

        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

    }
}
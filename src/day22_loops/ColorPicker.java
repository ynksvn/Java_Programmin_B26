package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int colorsPicked = 0;
        String unique = "";

        while (colorsPicked < 3) {

            System.out.println("Pick a color: ");
            String color = input.nextLine();

            if (unique.contains(color)){
                System.out.println("You already have this color");
            }else{
                colorsPicked++;
                unique += color + " ";
            }


        }
        System.out.println(unique);

    }

}

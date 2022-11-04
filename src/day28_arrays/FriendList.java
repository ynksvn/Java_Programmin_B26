package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int size = input.nextInt();

        String [] friends = new String [size];

        for (int i = 0; i<friends.length; i++){


            System.out.println("Enter your friends name " + (i+1));
            friends[i] = input.next();

        }
        System.out.println(Arrays.toString(friends));


    }
}
/*
Make an array of your friends names
asking how many friends do you have
then ask for each friends' name one at a time, store all the names into an array
 */
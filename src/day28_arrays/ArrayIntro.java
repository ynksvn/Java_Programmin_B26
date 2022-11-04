package day28_arrays;
import java.util.Arrays;
public class ArrayIntro {
    public static void main(String[] args) {


        String [] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburg"};

        System.out.println( Arrays.toString(cities));
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // print all the cities in one tine
        System.out.println("Reverse order of the cities " + cities[4] + " , " + cities[3] + " , " + cities[2] + " , " + cities[1] + " , " + cities[0]);

        // print all array all at one time

        System.out.println( Arrays.toString(cities));

        // number of elements
        System.out.println(cities.length);

    }
}

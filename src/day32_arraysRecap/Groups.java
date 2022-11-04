package day32_arraysRecap;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][3];
        // first one is number of arrays, second one is the size of the array
        //the second one(inner array) can leave as empty if we are going to have different sizes
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo [0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 2");
        String [] groupTwo = {"Barsi", "Demet", "Shina", "Ismail"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 3");
        //String [] groupThree = {"Mustafa", "Zhala", "Fatih", "Eda"}; this is a way to define the inner array
        // cydeo [2] ={ {"Mustafa", "Zhala"} not gonna work, because we already assigned an array in the beginning ( String [][] cydeo = new String[4][3];) To make it we need to reassign a new one
        cydeo[2] = new String [] {"Mustafa", "Lima" };
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4 by using the copy method");
        cydeo [3] = cydeo [2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();

        for (String [] innerArray :cydeo){ //this is the type of String array
            // loops through the 2d array, cydeo
            for (String eachWord : innerArray){ // this is the type of String
                // loops through every String element in each 1d inner array
                System.out.println(eachWord);
                // if you want to specify which inner group you would like to access, the traditional way can be used

            }
        }














    }
}

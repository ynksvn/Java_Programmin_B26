package day26_nested_loops;

public class Month {
    public static void main(String[] args) {


        for (int week = 1; week<=4; week++){
            System.out.println("Week: " + week);
        for (int day =1 ; day<=7; day++){
            System.out.println("\tDay: " + day);
        }
        }


    }
}
/*
Go through a whole month, by doing through each week and each day
For this task, we will go bigger to smaller because days are in the week
 */

/*
outer loop: first loop that has another loop inside of it
it determines how many executions of the code you want inside if this block
Inner loop: loop inside of another one
treat this as a normal loop that will be executed from beginning to end EACH ITERATION OF THE OUTER LOOP

 */
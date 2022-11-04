package day06_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Cheese Pizza";
        int slice, people, sliceOfPeople, leftover;
        slice = 8;
        people = 4;
        sliceOfPeople = 2; // int sliceOfPerson = slice / people;
        leftover = 0; //leftover = slice % people;

        int division = slice / people;
        int multiplication = (division) * people;

        System.out.println("We ordered " + typeOfPizza + " with " + slice + " slices, " + people + " people ate " + sliceOfPeople + " slices each with " + leftover + " leftover. ");


    }
}


/* create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over */
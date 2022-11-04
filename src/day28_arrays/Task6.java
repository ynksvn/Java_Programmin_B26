package day28_arrays;

public class Task6 {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Eva Rell", "Anna Johnson"};
        String initials = "";

        for (int i = 0; i<names.length; i++){
            initials += "" + names[i].charAt(0) + names[i].charAt(names[i].indexOf(" ")+1)+"\n";
        }
        System.out.println(initials);


    }
}

/*
Initials
•Given an array of classmate’s names, first name and last separated by a
space, print the initials of everyone
Ex:
Input:
[ “James Bond”, “Eve Rell”, “Anna Johnson” ]
Output:
JB
ER
AJ
 */
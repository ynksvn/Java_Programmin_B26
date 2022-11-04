package day37_wrapper_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {


        String s = "30";

        int seconds = Integer.parseInt(s); // coverts the "30" as a string to an int type.

        Integer.valueOf(s); // coverts the "30" String to integer wrapper class object

        int i2 = Integer.valueOf(s);
        // this still works, because the valueOf tools gives the value. IT converts the String to the integer object. I store the value into a primitive variable by int i2
        // primitive = object type [unboxing]

        System.out.println(i2+5);
        String s2 = String.valueOf(30); // converts the int to String
        System.out.println(s2 +5);


    }
}
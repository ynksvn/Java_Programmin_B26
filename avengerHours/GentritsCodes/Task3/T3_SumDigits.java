package GentritsCodes.Task3;

public class T3_SumDigits {

//    String - sum of digits in a string
//    Write a method that can return the sum of the digits in a string
    public static int sumOfDigits(String str){  //return type int but the parameter is string type

        int sum = 0; //created an int container to add the sum of the


        for (int i = 0; i < str.length(); i++) { //checking the every element of the String


            if (Character.isDigit(str.charAt(i))){ // if the character is digit, add to my sum container
                sum += Integer.parseInt("" + str.charAt(i)); //converting string to int with parseInt method
                //parseInt method only accepts String/ bosluk String e ceviriyor.
            }


        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("DC51GCA098911"));
    }
}

package day37_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
        String word = "aP3d%72&jd@jdJU";
        int upper = 0, lower = 0, number =0, other =0;
        String upperChars = "";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i); //not the repeat the code, make it simple

            if(Character.isUpperCase(letter)){
                upper++;
                upperChars += letter;
            }else if (Character.isLowerCase(letter)){
                lower++;
            }else if (Character.isDigit(letter)){
                number++;
            }else{
                other++;
            }

    }
        System.out.println("Number of Upper Case is " + upper + " There are the letters: " + upperChars + "\nNumber of Lower Case is " + lower + "\nNumber of Numbers is " + number + "\nNumber of other characters " + other);

}
    }

/*
give some string, count the number of uppercase and lowercase letters, numbers and other characters

aP3d%72&jd@jdJU
 */
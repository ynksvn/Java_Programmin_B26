package GentritsCodes.Task3;

public class T2_PasswordValidation {


    //    Write a return method that can verify if a password is valid or not. Requirements:

    public static void main(String[] args) {
        String password = "Ya1@";
        System.out.println("isPasswordValid(password) = " + isPasswordValid(password));
    }

    public static boolean isPasswordValid(String password) {
        boolean HasLower = false,
                HasUpper = false,
                HasDigits = false,
                HasSpecial = false;

        String specials = "\\.[]{}()<>*+-=!?^$@|";

//1. Password MUST be at least 6 characters and should not contain space
        if (password.length() <=5 && password.contains(" "))
            return false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // a container is created to assign the password's elements

            //5. Password should at least contain a digit
            if (Character.isDigit(c)) {
                HasDigits = true;
                //3. Password should at least contain one lowercase letter
            } else if (Character.isLowerCase(c)) {
                HasLower = true;
                //2. Password should at least contain one upper case letter
            } else if (Character.isUpperCase(c)) {
                HasUpper = true;
                //4. Password should at least contain one special characters
            } else if (specials.contains(c + "")) {
                HasSpecial = true;
            }

        }
        //6. if all requirements above are met, the method returns true, otherwise returns false
        return HasDigits && HasLower && HasUpper && HasSpecial;
    }

}

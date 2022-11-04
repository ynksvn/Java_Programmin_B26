package day33_methods;

import java.util.Locale;

public class Email {
    public static void builtEmail(String name, String domain){
        // order is matter!!
        String email ="" + name.toLowerCase().charAt(0);
                     // name.substring(0.1);
        int space = name.indexOf(" ");
        email += name.substring(space +1, name.length()).toLowerCase();
        // name.substring(space+1, space+4);
        email += "@" + domain +".com";
        System.out.println(email);

    }

    public static void main(String[] args) {
        builtEmail("Yanki Sevin", "gmail");
    }
}

package day35_methods;

import java.util.Locale;

public class FixFormat {

    public static String fixFormat (String str){
        str = str.trim();
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

}


/*
Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

 */
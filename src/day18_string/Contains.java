package day18_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it is above 70";
        System.out.println(day.contains("it is")); //true
        System.out.println(day.contains("itis")); //false

        System.out.println(day.contains("ay it")); //true
        System.out.println(day.contains("today")); //false = capital letter sensitivity

        /*
        if you want to check for specific characters
        days.contains("T) && day.contains("i") && day.contains("7");
         */


    }
}

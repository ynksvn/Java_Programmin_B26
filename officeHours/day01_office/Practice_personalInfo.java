package day01_office;

public class Practice_personalInfo {
    public static void main(String[] args) {

        String name, surname, quote;
        name = "Yanki";
        surname = "Sevin";
        quote = "Tomorrow sun will rise again";
        byte age = 36;
        char gender = 'F';
        boolean isStudent = true;
        short sibling = 3;
        long favnum = 400000L;
        int season = 4;
        double birthDay = 06.19;
        int year = 1985;

        String fullBirth = "" + birthDay + "." + year;

        String info = "My name is " + name + " " + surname + ".\tI am " + age + " years old and " + gender + ".\tI have " + sibling + " siblings. We all live in " + season + " seasons. My favorite season is summer.\nBecause I am a summer baby. I born in " + fullBirth + ". As final, my favorite quote is " + quote + ". Thank you.";

        System.out.println(info);


    }
}

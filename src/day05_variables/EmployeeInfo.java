package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String nameSurname = "Yanki Sevin";
        char gender ='F';
        int age = 37;
        String companyName = "World Bank";
        boolean fulltime = true;
        String jobTitle = "SDET";
        double salary = 120000000;
        int numberOfPTO = 25;
        String married = "married";
        char suite = 'A';

        String fullMessage = nameSurname + " is " + gender + " and " + age + " and " + married + "\n She is working " + fulltime + " for " + salary + " at " + companyName + " as " + jobTitle + "\n She is located at " + suite + " and she has " + numberOfPTO + " vacation days";

        System.out.println(fullMessage);


    }
}

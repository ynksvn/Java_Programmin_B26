package day05_variables;

public class EmployeeInfoExample {
    public static void main(String[] args) {


        String firstName, lastName, companyName, jobTitle;
        char gender, suite;
        int age, numberofPTO;
        double salary;
        boolean isFulltime, isMArried;

        firstName = "Yanki";
        lastName = "Sevin";
        companyName = "World Bank";
        jobTitle = "SDET";
        gender = 'F';
        suite = 'A';
        age = 37;
        numberofPTO = 20;
        salary = 1200000;
        isFulltime = true;
        isMArried = false;

        String fullDetails = "Employment information for " + firstName + " " + lastName + ", Gender: " + gender + ",\n" + jobTitle + " at " + companyName + ". Currently " + age + " years old. \n" + companyName + " is located in suite " + suite + ". This years salary comes to $" + salary + ".\nOther details:\nPTO: " + numberofPTO + ", Fulltime ? " + isFulltime + ", Married? " + isMArried + ".";

        System.out.println(fullDetails);

    }
}

package day44_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James Bond", "SDET");
        System.out.println(employee1);


        Employee employee2 = new Employee("Yanki Sevin", 12345, "SDET", 120.000);
        System.out.println(employee2);

        employee1.goToMeeting();
        employee2.goToMeeting();







    }
}

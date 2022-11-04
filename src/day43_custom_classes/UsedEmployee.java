package day43_custom_classes;

public class UsedEmployee {
    private static Object goToMeeting;

    public static void main(String[] args) {
        Employee employee1 = new Employee("James Bond", "Agent");
        System.out.println(employee1);


        System.out.println();

        Employee employee2= new Employee("Yanki Sevin", 123456, "SDET", 120000 );
        System.out.println(employee2);

        employee2.goToMeeting();

    }


}

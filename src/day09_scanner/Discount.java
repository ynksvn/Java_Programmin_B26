package day09_scanner;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isTeacher = true;
        boolean isPoliceOfficer = false;
        boolean isFireFighter = false;


        boolean IsDiscount =  isWeekend && (isTeacher || isPoliceOfficer || isFireFighter); //

        System.out.println(IsDiscount);
    }
}

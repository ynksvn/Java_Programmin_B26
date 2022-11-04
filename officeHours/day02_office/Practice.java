package day02_office;

public class Practice {
    public static void main(String[] args) {

       // Task01 Casting and Variables Practice
        /* 2 types of Casting:
        1)IMPLICIT DATA: smaller to bigger data
        - done by compiler
        - No loss data
        - Called as WIDENING

        2) EXPLICIT DATA: bigger to smaller data
        - done by developer
        - may loss data
        - called as NARROWING

         */
        //byte to short
        byte b = 10;
        short s= b;//implicit casting

        // double to int
        double a = 5.3;
        int i =(int)a;
        System.out.println("i= " + i);
        a=i;
        System.out.println("a = " + a);
        short c = (short) a;
        System.out.println("c = " + c);

        //long to int
        //long l =99; implicit casting. it is an integer number
        long l = 9999999999L; // there is no casting
        int i2= (int) l;
        System.out.println("i2 = " + i2);

        double d = 15.2;
        int i3 = (short)d; //
        System.out.println("i3 = " + i3);



    }
}

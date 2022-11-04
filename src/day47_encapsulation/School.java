package day47_encapsulation;

import day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {

        CydeoStudent emre = new CydeoStudent("Emre", 5);
        System.out.println(emre);

        CydeoStudent.printInfo();
        emre.printInfo();
        System.out.println();

        System.out.println(CydeoStudent.instructors[0]);

        for (String each : CydeoStudent.instructors){

        }




    }

}

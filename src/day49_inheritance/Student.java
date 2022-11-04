package day49_inheritance;

public class Student extends Person {

    int funLevel;

    public void study(){
        System.out.println(name + " is studying");
        System.out.println(name+ "'s fun level is  " + funLevel);
    }
}
//This is your sub class of Person
package day49_inheritance;

public class Building {
    public static void main(String[] args) {


        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.hobby = "spy stuff";
        obj.talk();;
        //obj.study() = no access because study() method was made in the child class

        Student obj2 = new Student();
        obj2.name ="Yanki";
        obj2.age =37;
        obj2.hobby = "Yoga";
        obj2.talk();
        //the above variables were inherited from the Person class
        obj2.funLevel = 100;
        obj2.study();

    }
}

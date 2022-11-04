package day54_abstraction.animal.animal;

import day54_abstraction.animal.language.Language;

public final class Parrot extends Bird implements Flyable, Language {
    //extend first, interface is later. We can add more than one interface with comma. The order of interfaces do not matter
    //"implements Flyable"  inherites the fly method - We have to override it
    //a parent class that i don't need to inherit
    //if we make it the final class, it can\t be inherited and unchangeable
    //it is a concrete class, It is first non-abstract class in this inheritence
    //

    @Override
    public void eat() {
        System.out.println("Parrot wobbles over to the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly");
    }


    @Override
    public void hi() {
        System.out.println("Parrot can say Hi");
    }

    @Override
    public void bye() {
        System.out.println("Parrot can say Bye");
    }
}

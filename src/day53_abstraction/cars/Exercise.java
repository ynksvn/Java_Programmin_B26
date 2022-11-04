package day53_abstraction.cars;

public abstract class Exercise {


    final String name; //without constractor, it gives error.

    public Exercise(String name) { //we can't create an object in abstract class. Constructor should call the parent constructor
        this.name = name;
    }


    public abstract void performExercise();

    public abstract int getCaloriesBurned (int minutes);




}

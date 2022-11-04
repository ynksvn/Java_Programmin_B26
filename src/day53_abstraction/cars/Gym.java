package day53_abstraction.cars;

public class Gym {

    public static void main(String[] args) {

        //We cant create Exercise class object because it is abstract

        Running obj2 = new Running();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));
    }
}

package day43_custom_classes;

public class UsedTrafficLight {
    public static void main(String[] args) {

        TrafficLight light =new TrafficLight("Green");
        //object               //constructor call

        System.out.println(light.color);

        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light2.color);

        // we don't need to or shouldn't assign a value like light2.color = "Yellow", unless we want to reassign it.

    }
}

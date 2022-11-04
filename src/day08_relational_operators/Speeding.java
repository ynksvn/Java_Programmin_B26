package day08_relational_operators;

public class Speeding {
    public static void main(String[] args) {
int speed, speedLimit;
speed = 80;
speedLimit = 60;

boolean isSpeeding = speedLimit<speed;

        System.out.println("Are you speeding ? " + isSpeeding);
    }
}

/*    create a class called Speeding, and write a program to determine if the
        car is speeding
        declare 3 variables:
        current speed, speed limit, speeding boolean
                print
        "Are you speeding? " true/false */
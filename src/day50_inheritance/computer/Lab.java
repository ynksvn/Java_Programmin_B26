package day50_inheritance.computer;

public class Lab {

    public static void main(String[] args) {

        Computer obj1 = new Computer("generic os",300);
        System.out.println(obj1);

        Windows obj2 = new Windows(500);
        //Windows is child class.
        //the contructor needed int argument. The number is int by default
        System.out.println(obj2);

        Mac obj3 = new Mac(500);
        System.out.println(obj3);

    }
}

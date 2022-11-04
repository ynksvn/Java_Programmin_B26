package day54_abstraction.animal.animal;

public class Dog extends Animal{
    // this is a normal class, cannot be inherited with abstract, It has to be override. This is a concrete class
    //if child class of an abstarct class is concrete(not abstract) you must to implement/override(use)all abstarcts metods from that parent class

    @Override
    public void eat() {

        //implementations:
        System.out.println("Dog goes to the bowl and eat");

    }


}

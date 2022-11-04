package day52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();

    }

  //  @Override --> We cannot override the static methods, but we can declare this method and the staticMethod from the parent class will bcome hidden
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");

    }
}

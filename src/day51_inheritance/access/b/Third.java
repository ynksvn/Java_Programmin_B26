package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {

    //different class, different package

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one); //only public one is visible
        // System.out.println(obj.two); is protected, directly accessible in the same package and by sub-classes in any package. IT is not accessible if there  is no inheritance, protected works same way as default
        // System.out.println(obj.three); is default, only visible in the same package
        // System.out.println(obj.four); is private, only visible in the same class
    }
}

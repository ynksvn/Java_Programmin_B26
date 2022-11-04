package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First {

    //different class. different package
    //with heritance

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one); //is public
        //System.out.println(obj.two); is protected
        //System.out.println(obj.three); is default
        //System.out.println(obj.four); is private

        Four obj2 = new Four();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); //protected - when it is inherited from the first class to the four class, so the two variable belongs to the objects of Four class (sub-class)
      //  System.out.println(obj2.three);
    }
}
/*
line 13 is trying ti directly access a protected variable outisde of the package. You cannt directly access any protected information outside of the package
line19, we are able to access the two variable because it is inherited from the First class to the Four class. So the two variable belongs to the objects of the Four class (sub class)
 */
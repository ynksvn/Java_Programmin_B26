package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
        //We can do with this: assign/reassign, math, casting
        //We can't do : a.method()

        // 2 ways to do 'Integer'
        Integer a2 = new Integer(10);
        Integer a3 = 20; // autoboxing. coverts primitive to wrapper class object
        int a4 = a3; // unboxing. converts object to primitive

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2; // this is primitive type

        Byte b2 = 20; // this is wrapper class objects


    }
}

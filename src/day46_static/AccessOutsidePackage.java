package day46_static;

import day47_encapsulation.AccessModifier;

public class AccessOutsidePackage {
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;


    //different class and package
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
       // System.out.println(obj.b);
       // System.out.println(obj.c);

        System.out.println(AccessModifier.x);
       // System.out.println(AccessModifier.y);
       // System.out.println(AccessModifier.z);

        //c and z are private, there are not valid in this class and package. They can only be accessed in the same class

        // b and y are default. they didn't have any other access modifier

        //public is still accessible

    }
    }

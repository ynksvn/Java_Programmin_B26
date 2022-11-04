package day47_encapsulation;

public class AccessInPackage {
//different class, same package
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;


    //in the same class:
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        //System.out.println(AccessModifier.z);

        //c and z were not accessible outside of the class because there are private. Private is accessible only in the same class. Only public ones are shown. Default ones are only accessible in the same package


    }
    }

package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
        // String msg = sayHello(); it is not valid because the method is void, there is no return value
        sayBye(); // it doesn't print like this
        System.out.println(sayBye());
        String msg = sayBye(); // you can assign a variable because it is a return method type

        System.out.println(msg.trim().charAt(0));


    }

    public static void sayHello(){
        System.out.println(" Hello ");
    }
    public static String sayBye(){
       return " Bye Bye"; // it doesn't print like this
    }
}

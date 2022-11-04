package day36_methods;

public class Picture {

    public static void draw(){
        System.out.println("trying to draw ");
    }

    public static void draw(String color){
        System.out.println("draw with " + color);

    }
    public static void draw(String color, String color2){
        System.out.println("drawing with color " + color + " and with " + color2);
    }

    public static void draw(int size){
        System.out.println("drawing with size " + size);
    }
    /*
    public static void draw(int length){
        System.out.println("drawing with size " + length);
        }  this is not valid by just changin the parameter name
*/
}

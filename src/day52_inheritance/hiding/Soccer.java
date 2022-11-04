package day52_inheritance.hiding;

public class Soccer extends Sports {
    public static void cheer() {
        System.out.println("Cheering from the Child class");
    }
}

//Not
/*
it looks like we are overriding but we are not, because the method is static
We are hiding the cheer methood from the parent class

 */
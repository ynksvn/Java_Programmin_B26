package day15_04_04_2022;

public class P01_WrapperIntro {
    public static void main(String[] args) {
        //Autoboxing
        Integer a = new Integer(30); //
        Integer b=30;
        //these 2 are totally same

        Integer c= Integer.valueOf(30);

        int d = c; // it is unboxing, converted to primitive

        //valueOf() vs parseInt()/parseDouble()
        //valueOf() = returns Objects
        //parseMethods() = returns primitives

       int e =  Integer.parseInt("123");//it accepts as String, we have to use " "

      Integer f=  Integer.valueOf(123);

      //Casting
       Integer num = Integer.valueOf(123);
       //Double doub = num; - it gives error

        Double doub = Double.valueOf(num);


    }

}

/*
Why do we need wrapper classes: We use them inside the Array List
*Collection allows only OBJECTS (non-primitive)
String, Integer, Double etc...
*Collection --> ArrayList etc
*Wrapper Classes has many useful methods
 -Character.isDigit()
 -Character.isUpperCase()
 -Character.isLowerCase()
 -Character.isLetter()
 - valueOf() vs parseInt()/parseDouble() etc.
 We use numbers for parse
 PArse ibject to primitive

 Autoboxing vs Unboxing

 Autoboxing --> Primitive to OBJECTS
 Unboxing --> OBJECTS to primitive


 */
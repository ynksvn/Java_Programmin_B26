package day55_polymorphism.animal;

import day52_inheritance.hiding.A;

public class Wild {
    public static void main(String[] args) {

        //all possible reference/object of Lizard

        //itself - reference

        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "Lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name + "\n" + lizard.numberOfClaws + "\n" + lizard.skinColor);
        System.out.println();

        //super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "Lizard";
        reptile.numberOfClaws = 10;
        //reptile.skinColor = "camo"; in order to java to compile, we have a reptile reference, this reference doesn't know the skin color. skin color done in the lizard
      //  file.  Reptile class doesnt have the skincolor because the reference doesn't have access
        System.out.println(reptile.name + "\n" + reptile.numberOfClaws );
        System.out.println();


        //super class - animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "Lizard";
        //Animal reference does not have access to numberOfClaws, skincolor



        /*
        We made 3 lizard objects with 3 different references: itself, reptile and animal (both super class)
        but when it comes to execution, the object implementation is run

         */

    }
}

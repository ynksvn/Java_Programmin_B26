package day51_inheritance.app;

public class Instagram extends App{

    public Instagram(double version){
        super("Instagram", version);
        // you can do version hardcoded like 4.1 but we prefer to use parameter so the data will be more flexible
    }
    public void postPicture(){
        System.out.println("Posting picture to Instagram");
    }



}


/*
Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
 */
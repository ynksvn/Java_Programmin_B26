package day50_inheritance.computer;

public class Windows extends Computer {

    public Windows(int memory){
        super("Windows",memory);
        //it calls the parent constructor, which sets the os variable to be "Windows" and sets the memory variable to be the argument from the Windows constructor
        //it has to match with my arguments
    }




}
//Window is a Computer. Computer is my parent class
//Child class must call one of parent consturctor
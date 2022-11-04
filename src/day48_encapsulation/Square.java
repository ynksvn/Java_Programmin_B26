package day48_encapsulation;

public class Square {
     /*
        create a class called Square

        - data:
            side

    */

    private int side; //only accessible in the class

    /*
        - constructor

            - create a constructor that creates a Square object with the side

            	call setter here

        - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

*/

    public Square(int side){
        setSide(side); //calling the method and assign the variable with it
    }

    /*
        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

     */

    public int getSide(){ // getter method. It doesnt require any value
        return side;
    }

    // cannot do obj.side anymore
    // do obj.getSide()

    public void setSide(int side){ //setter method
        if(side > 0){ //otherwise it will be not assigned/ to avoid to assign negative number
            this.side = side;
        }
    }

    // cannot do obj.side = value
    // do obj.setSide(value)

    public int calculateArea(){
        return side * side;
    }

    public int calculatePerimeter(){
        return side * 4;
    }

    public String toString(){
        return  "Side of Square: " + side + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter();
    }

}



package day51_inheritance.shapes;

public class Square extends Shape{

    double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override // it is optional to add this. This helps us to understand if we overload properly or not
    public double area(){
        return side * side;
        // this is overloading. changing the method words and return with a different value
    }
    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}


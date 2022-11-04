package day43_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;

        calculatePrice();; // we called the method

//        totalPrice = width*length*unitPrice;
//         (isPersian){
//            totalPrice+=200; - We did it as a method for usability
    }


    public void calculatePrice() {

        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }
    //if you want to print the object, the toString method is needed
    public String toString(){
        return (isPersian ? "The Persian Carpet" : "The Carpet") + "\nThe dimensions: " + width + " x " + length + "\nThe unit price is $" + unitPrice + "\nThe total price: $" + totalPrice;

        //We should add the parenthesis for the if part, otherwise it will pursue the rest of the information as else statement
    }
}
package day55_polymorphism.shopping;
/*
Create an abstract class OnlineShopping
-Inherits Shopping and implements shipping
- Does not need to implement any abstract methods
- Declare abstract method
viewCart()
 */
public abstract class OnlineShopping extends Shopping implements Shipping{

    public abstract void viewCart();

}

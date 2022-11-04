package day57_exceptions.WebElement;

import java.awt.*;
import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {
        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>();
        //ArrayList of WebElements which means the object implement the WebElement interface
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);


        for (WebElement each : elements){

            System.out.println(each.getText());

            if (each instanceof Form){
                ((Form)each).submit(); // casting
            }
        }
        WebElement logo = new Image();
        logo.click();
        //click method is accessible by the WebElement interface reference, then execution happens on object side

        //logo,extension = ".png" Weblement interface does not have accessibility to the variable

        ((Image)logo).extension = ".png";
        // This is casting the logo (WebElement reference) to a Image reference, then the Image reference as access to the extension variable
    }
}

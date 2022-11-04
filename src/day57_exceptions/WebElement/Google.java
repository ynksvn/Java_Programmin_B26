package day57_exceptions.WebElement;

public class Google {
    public static void main(String[] args) {

        WebElement link = new Link();
        //created a Link object with WebElement reference

        WebElement input = new Input();
        //created a Input object with Element reference

        WebDriverUtil.clickElement(link);

        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(new Link());

        /*
        String [] -> array that stores String objects

        Link [] -? array that stores link objects
         */

        WebElement [] allElements = new WebElement[4];
        //created an array that will store objects from classes that implement the WebElement interface
        // [null, null, null, null]

        allElements [0] = link; // [Link obj, null, null, null]
        allElements [1] = input;  // [Link obj, Input obj, null, null]
        allElements [2] = new Input(); // [Link obj, input obj, input obj, null]
        allElements [3] = new Image(); // new Image is WebElement type
                                      // [Link obj, input obj, input obj, image obj]









    }
}

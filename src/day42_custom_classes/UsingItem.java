package day42_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Apples";
        item1.price = 3.99;

        //System.out.println(item1);// it gives : day42_custom_classes.Item@30c7da1e which is not useful for us. We need to tostring class to print in the item class

        System.out.println(item1.toString());

        Item item2 = new Item();
        item2.name ="Papers";
        item2.price = 2.99;
        System.out.println(item2);

    }
}

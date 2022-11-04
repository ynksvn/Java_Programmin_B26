package day43_custom_classes;

public class UsedPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Iphone X");// this one calls the constructor on line 8 in Phone file
        System.out.println(phone1);

        System.out.println();

        Phone phone2 = new Phone("Iphone 12", "Apple");
        System.out.println(phone2);

        System.out.println();

        Phone phone3 = new Phone("Iphone 12 Plus", "Apple", 128, 10);
        System.out.println(phone3);



    }
}

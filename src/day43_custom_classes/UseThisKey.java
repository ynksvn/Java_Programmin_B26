package day43_custom_classes;

public class UseThisKey {


        public static void main(String[] args) {

            ThisKeyword obj = new ThisKeyword(300); ////Java prioritize the lcoal value, thats why this will print as 400
            System.out.println(obj.a); //This is calling from instance which was assigned as 100
            //it will print 600 after I used the this keyword

        }
    }

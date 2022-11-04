package day54_abstraction.animal.creating;

public class Runner {
    public static void main(String[] args) {

       // Create obj = new Create(); this is not valid. It is not possible to make objects of interfaces


        Book obj = new Book();
        //Book is a non-abstract, normal class. Book is also concrete
        obj.read();
        obj.write();



    }
}

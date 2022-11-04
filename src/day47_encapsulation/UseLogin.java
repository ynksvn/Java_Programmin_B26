package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
     //   obj.username= "jamesbond";
       // obj.password = "1234";
        //cannot access private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword()); //it printed null, because it was not suitable for the requirements


        obj.setPassword("james007bond");
        System.out.println(obj.getPassword());



    }
}

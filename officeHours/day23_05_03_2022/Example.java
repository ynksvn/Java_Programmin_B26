package day23_05_03_2022;

public class Example {
    public static void main(String[] args) {
        Credentials obj = new Credentials();
        System.out.println(obj.getPassword());
    }
}


class Credentials{
    private String username = "AngryBird";
    private String password = "WoodenSpoon";

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}

package day15_switch;

public class Browser {
    public static void main(String[] args) {



        String browser = "google";
        String url = "www.google.com";

        switch (browser){
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in safari");
                System.out.println("Loading");
                break;
            case "Firefox":
                System.out.println("Opening" + url + " in firefox");
                break;
            default:
                System.out.println(browser + " is not a valid");
        }





    }
}

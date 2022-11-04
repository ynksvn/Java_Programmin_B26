package day31_arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZone = zones.split(",");

        for (String eachZone:allZone){
            System.out.println(app + " is deploying on " + eachZone);
        }

        for (int i =0; i<allZone.length; i++){
            System.out.println(app + " is deploying on " + allZone[i]);
        }









    }


}


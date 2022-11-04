package day02_office;

public class Task2 {
    public static void main(String[] args) {

        int gallon = 10;
        double liters = gallon * 3.7841;
        System.out.println("------------------------");

        System.out.println(gallon + " is equal to " + liters + " as liters");
        System.out.println();

        //Time Converter
        /*
        60 sec = 1 min
        60 min = 1 hour
        60*60 = 3600 sec in an hour
         */

        int inputSeconds = 3695;
        int hours, minutes, seconds;
        double day;


        hours = inputSeconds/3600;  //to find out the time
        day =  hours/24;
        System.out.println(day);
        minutes = inputSeconds % 3600/60;
        seconds = inputSeconds%60;
       String hour = hours+ " hours " +minutes+ " minutes " + seconds + " seconds";
        System.out.println(hour);



     // day/hour/min/sec
        /*
        3600 second = 1hour
        60 second - 1 minute
        24 hour * 3600
         */





    }
}

package day1_04_04_2022;

public class P01_TimeStamp {
    public static void main(String[] args) {
        String date = "10/10/2022 14:59:00";

        //a new obj created in str pool
        date = date.replace("/","");
        //a new obj created in str pool. The previous one is located at garbage collection
        System.out.println("First step " +date);

        date = date.replace(" ","");
        //a new obj created in str pool. The previous one is located at garbage collection
        System.out.println("Second step " +date);

        date= date.replace(":","");
//a new obj created in str pool. The previous one is located at garbage collection
        System.out.println("Third step " +date);


        //After we created a method, this is how we can print
        System.out.println("from String return method-> "+timesStamp("10/10/2022 14:59:00"));


       // String timesStamp = timesStamp("10/10/2022 14:59:00");
     //   System.out.println(timesStamp);


        //With Void Method
        // System.out.println(timesStampVoid("10/10/2022 14:59:00")); - We can't print here. It doesn't recall it
        timesStampVoid("10/10/2022 14:59:00");
    }

    public  static String timesStamp(String dateFromUI) {
        return dateFromUI = dateFromUI.replace("/", "").replace(" ", "").replace(":", "");

        // if i change the return type, it is not overloading


        //public static void timesStamp(String date){- it will give error. We have to change the name to be able to create another method
    }
        public static void timesStampVoid (String date){

            date = date.replace("/", "").replace(" ", "").replace(":", "");
            //We can't use the "return" here. because void doesn't have a return. We can print inside of the made method
            System.out.println("With Void Method " + date);
        }
    }


/*
  Task 01(String):

         Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900

 */

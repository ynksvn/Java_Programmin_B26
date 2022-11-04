package day29_arrays.day29_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30,12,159,12};

        for (int i =0; i< nums.length; i++){
            System.out.println("Traditional: "+ nums[i]);
        }

        for (int element : nums){
            System.out.println("for each: " + element);
        }

        // String example

        String [] classes = {"java", "soft skills", "selenium", "database", "api"};

        for (int i = 0; i<classes.length; i++){
            System.out.println(classes[i]);
        }
        for (String each : classes){
            System.out.println(each);
        }

        double [] prices ={10.4,40.2,410.0};
        for (int i = 0; i< prices.length; i++) {
            System.out.println(prices[i]);
        }
            for (double num: prices ) {
                System.out.println("$" + num);
            }
        }

    }


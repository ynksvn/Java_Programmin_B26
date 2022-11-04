package day37_wrapper_arraylist;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String [] arr = result.split(" ");

        System.out.println(Arrays.toString(arr));
        String resultStr = arr[1].replace(",","");
        String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if (resultNumber>=0){
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }
        if (timeNumber<=2&&timeNumber>=0){
            System.out.println("TEST CASE PASSED ");
        }


        System.out.println();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

    }
}

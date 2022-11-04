package GentritsCodes.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3_Array_ConcatTwoArrays {

//    Write a return method that can concat two arrays
//    Numbers - odd & even
//office hours
// day 11  son 11 dakika merge array diye bir task yapmis


    public static void main(String[] args) {
        int[] odd = {1, 2, 3};
        int[] even = {4, 5, 6};


        mergeArrays(odd, even);
    }

    public static void mergeArrays (int[] odd, int[]even) {
        int[] result = new int[odd.length + even.length];

        int i = 0;
        for (int each : odd) {
            result[i++] = each;
        }
        for (int each : even) {
            result[i++] = each;
        }


        System.out.println(Arrays.toString(result));
    }

}
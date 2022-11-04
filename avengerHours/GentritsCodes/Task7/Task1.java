package GentritsCodes.Task7;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverse(a)));
    }

        /*
    write a function that can reverse an array
     */

public static int[] reverse(int[] arr){

    int[] result = new int[arr.length];
    int index = 0;

    for (int i = arr.length-1; i>=0; i--){

        result[index++] = arr[i];
    }

    return result;

}

}

package GentritsCodes.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class T1_ArrayNunique {
//    Array - N unique integers that sum up to 0
//    Write a function:
//    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//    The function can return any such array.
//    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
//    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

    //day 14 office
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(5)));
    }

    public static int[] sumUpToZero(int N){

        int [] arr = new int[N]; //the length is N

        //to find the total sum of the digits
        int sum = 0;

        for (int i =0; i< arr.length-1; i++){ //not include the last member of array
            arr[i] =i; // this will give me the unique number
            sum+=i;

        }

        arr[arr.length-1] = -sum; //the last element to have result 0 for the sum
        return arr;



    }
    //Julia's way
    public static String sumZero(int a){
    int[] n =new int[a];
    int index=0;
        for (int i = 1; i <= n.length/2; i++) {
        n[index++]=i;
        n[index++]=-i;
    }
        if(a %2==1){
        n[index++]=0;
    }
        return Arrays.toString(n);
}
}

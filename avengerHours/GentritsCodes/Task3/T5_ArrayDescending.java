package GentritsCodes.Task3;

import java.util.Arrays;

public class T5_ArrayDescending {

    /*

 Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        int [] arr = {10,20,7, 8, 90};
        int temp=0; //created a container for temporary
        for (int i = 0; i < arr.length-1; i++) {  // checking the element of int arr with outer loop
            for (int j = 0; j < arr.length-1; j++) { // to check the elements with each outher with inner loop
                if(arr[j]<arr[j+1]){  // 10>9   {10,9,8,7};  {9,10,8,7}; find/if the element is smaller
                    temp = arr[j+1];  // temp = 9-8
                    arr[j+1] = arr[j];  //{10,10,8,7};    {9,10,10,7};  //I swap the numbers. i wrote the smalle one first
                    arr[j] = temp;     //{9,10,8,7};       {9,8,10,7};
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}

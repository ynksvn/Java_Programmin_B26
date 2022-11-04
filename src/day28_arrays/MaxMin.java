package day28_arrays;

public class MaxMin {
    public static void main(String[] args) {
      int [] nums = { 500, 120, -80, 90, 250, - 10};

      int max = nums[0];
      int min = nums[0];

     for (int i = 0; i < nums.length; i++ ) {

         int number = nums[i];

         if (number> max){ //if(nums[i] > max)
             max = number;//max = nums[i]
         }
         if (number<min){
             min = number;
         }
     }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
     }

}

 /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */

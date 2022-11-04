package GentritsCodes.Task3;

public class T4_ArrayFindMaxMin {
//    Array - Find Maximum
//    Write a method that can find the maximum number from an int Array
//     Array - Find Minimum
//    Write a method that can find the maximum number from an int Array
public static void main(String[] args) {
    int[] nums = {300, 620, -90, -45, 150, 90};
    System.out.println(findMax(nums));
    System.out.println(findMin(nums));
}
    public static int findMax(int[]nums){
        int max = nums[0]; // ilk degerle kiyasliyor

        for (int i = 0; i < nums.length; i++) {  //checking the elements of int array - tek tek kontrol etmek icin

            int number = nums[i]; // number container olusturup int i ti assign ettim. to make my code more readable

            if (number > max) { // if(nums[i] > max) //her birini check edebilmek icin/ hangi numara buyukse onu assign etti
                max = number; // max = nums[i] //reassign the number to max until find the max
            }

        }
        return max;

    }

    public static int findMin(int[]num){
        int min = num[0];

        for (int i = 0; i < num.length; i++) {

            int number = num[i];

            if (number < min) { // if(nums[i] < min)
                min = number; // min = nums[i]
            }

        }
        return min;

    }




}

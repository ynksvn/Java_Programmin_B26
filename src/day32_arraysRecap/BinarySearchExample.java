package day32_arraysRecap;
import java.util.Arrays;

  public class BinarySearchExample {

public static void main(String[] args) {
        int[] nums = {4, 10, 30, 100};
        //to be able to use the binary it has to be sorted for the proper result/

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200)); // it gives minus result and show where it would be
        System.out.println(Arrays.binarySearch(nums, 6));

        int[] nums2 = {5, 5, 5};
        System.out.println(Arrays.binarySearch(nums2, 5));
    }
}
package day39_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

      /*  nums.remove(500);
      We can't do this. It will go out of bounds exception. Java accepts this as index number, not as an object.
       */
        Integer i = 500;
        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200));
        System.out.println(nums);

    }
}

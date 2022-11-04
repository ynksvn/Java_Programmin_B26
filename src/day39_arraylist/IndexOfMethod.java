package day39_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums.indexOf(100));
        // it will give you the first one

        System.out.println(nums.indexOf(700));
        //it is not in our ArrayList so it will give -1

        int i = nums.indexOf(200);
        System.out.println(i);

        System.out.println(nums.lastIndexOf(100));
        // it will give the index of the last 100

       // nums.remove(100);
        //System.out.println(nums.indexOf(100));
        // it is for the middle one. To be able to reach the middle, we asked to remove the first value
        nums.set(nums.indexOf(100),0);
        System.out.println(nums.indexOf(100));
        //it is better to use the set method. Instead of removing, going to first 100, and changed to 0. so the second one will be the first one



    }
    }

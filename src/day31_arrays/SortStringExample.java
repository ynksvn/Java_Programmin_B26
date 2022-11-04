package day31_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {"java", "Hello", "$Dollar", "4hour", "five5", "Zebra", "SIX", "six", "Hi"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

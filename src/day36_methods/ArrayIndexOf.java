package day36_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int [] arr = {12,5,1,5,2,6,5};
        System.out.println(indexOf(arr, 2));
        System.out.println(indexOf(arr, 20));
        System.out.println(indexOf(arr, 5));

        String [] words = {"java", "apple", "water", "hello"};
       // System.out.println(indexOf(words, "hello"));
        // it will not work because my original method is in different type. IT will work when i define a new method for String/ it is overloading the method
        System.out.println(indexOf(words, "hello"));
    }
    public static int indexOf(String [] str, String element){
        for (int i = 0; i< str.length; i++){
            if (str[i].equals(element) ){
                return i;
            }
        }



        return -1;
    }

    public static int indexOf(int [] nums, int element){

        for (int i = 0; i< nums.length; i++){
            if (nums[i] == element){
                return i;
            }
        }



        return -1; //if it doesn't match it will return to index number

    }



}

package day36_methods;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int [] a= {1,2,3};
        int [] b = addElement(a,4);
        System.out.println(Arrays.toString(b));

        int [] y = {5,23,6,21};
        int [] z = {3,23,6};
        System.out.println(Arrays.toString(addElement(y,z)));
    }

    public static int[] addElement(int[] original, int elementToAdd){
        int [] newArray = new int[original.length+1];

        for (int i = 0; i<original.length; i++){
            newArray[i] = original[i];

        }
        //instead of doing a loop, we could habe used Arrays,copyOf() method
        newArray[newArray.length-1] = elementToAdd;
        return newArray;
    }
    public static String[] addElement(String [] original, String element){
        return null;
    }
    public static int[] addElement(int[] original, int [] elementsToAdd){
        int [] newArray = new int[original.length + elementsToAdd.length];
        for (int i =0, j=0 ; i<newArray.length; i++){

            if(i<original.length){
                //added the elements from the orginal array in the new array
                newArray[i] = original[i];
            }else {
                //added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
                // it will store it in the new array and then increment it
            }
        }





        return newArray;
    }
}

package my_utilities;

public class ArrayUtil {
    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maxNumber(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {

            if (each == element) {
                return true;
            }
        }


        return false;
    }

    public static int[] addElement(int[] original, int[] elementsToAdd) {
        int[] newArray = new int[original.length + elementsToAdd.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i < original.length) {
                //added the elements from the orginal array in the new array
                newArray[i] = original[i];
            } else {
                //added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
                // it will store it in the new array and then increment it
            }
        }


        return newArray;
    }
}

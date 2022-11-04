package GentritsCodes.Task2;

public class StringRemoveDuplicates {
    /*
    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";

        System.out.println(Duplicate(str));

    }

    public static String Duplicate(String str){
        String unique = "";

        for(int i = 0; i < str.length(); i++){
            if(!unique.contains("" + str.charAt(i))){
                unique += str.charAt(i);
            }
        }return unique;

    }
}

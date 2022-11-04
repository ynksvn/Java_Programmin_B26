package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        /*
        reverse the sentence
        Monday is today
         */

        String str = "Today is Monday";
        String [] words = str.split(" ");

        String reversed = "";

        for (int i = words.length -1; i>=0; i--){
            reversed+= words [i] +" ";

        }
        System.out.println(reversed.trim());






    }
}

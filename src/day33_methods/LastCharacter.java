package day33_methods;

public class LastCharacter {
    public static void main(String[] args) {

        String [][] words ={
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        for (String [] eachArray : words){
            for (String eachWord : eachArray){
              // System.out.println(eachWord);
                // this is how we print each word in the each array
                System.out.print(eachWord.charAt(eachWord.length()-1));
            }
            System.out.println();
        }





    }
}
  /*
        Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

        Ex:

            {"James", "is", "back"}
            {"he", "was", "never", "gone"}
            {"methods", "tomorrow"}

        Output:
            ssk
            esre
            sw

         */
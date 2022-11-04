package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {


        String s = "abcde";

        if (s.length() % 2 == 0) { // it means our word is even length
            char firstMiddle = s.charAt(s.length()/2 -1);
            char secondMiddle = s.charAt(s.length()/2);
            System.out.println("With charAt: " + firstMiddle+secondMiddle);
            System.out.println("With substring: " + s.substring(s.length()/2 -1, s.length()/2+1));

        }else{
            // our word is odd length

      char middle = s.charAt(s.length()/2);
            System.out.println("With charAt " + middle);
            System.out.println("With substring: " + s.substring(s.length()/2,s.length()/2 + 1));


        }



    }
}

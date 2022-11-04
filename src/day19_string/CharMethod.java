package day19_string;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0));  //this is for the first letter. Zero represents first letter
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       //  System.out.println(s.charAt(4)); = will give error

int lastIndex = s.length() -1; // 4-1 = 3
        System.out.println(s.charAt(lastIndex)); // this is the same is same with line 13.
        int secondToLastIndex = s.length()-2;
        char secondToLastChar = s.charAt(secondToLastIndex); // same with line 12. just hardcoded
        System.out.println(secondToLastChar);



    }
}

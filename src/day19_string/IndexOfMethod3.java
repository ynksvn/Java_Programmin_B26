package day19_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";
                //     0123456789

        System.out.println("first ': " + word.indexOf('i'));
        System.out.println("last i: " + word.lastIndexOf('i'));

        System.out.println("second i : " + word.indexOf('i',4));
        System.out.println("third i is " + word.indexOf('i', 6));

        System.out.println();

        String s1 = "wooden spoon";
        String s2 = s1.substring(s1.indexOf("s"));
        System.out.println(s2);


    }
}

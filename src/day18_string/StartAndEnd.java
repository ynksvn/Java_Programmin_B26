package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s = "A";
        System.out.println(str.startsWith(s));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("good"));
        System.out.println(sentence.endsWith("today was a good day"));

    }
}

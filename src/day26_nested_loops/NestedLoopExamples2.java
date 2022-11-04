package day26_nested_loops;

public class NestedLoopExamples2 {
    public static void main(String[] args) {

        for (int i =0; i<5; i++){
            System.out.print("A");
            for (int j = 0; j<i; j++){ // those two statements are attached to each other
                System.out.print("B");
            }
            System.out.println(); //line breaking
        }

        System.out.println("----------------------");

        String s = "java";
        for (int i=0; i<s.length();i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}

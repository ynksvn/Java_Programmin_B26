package day26_nested_loops;

public class NestedLoopExamples {
    public static void main(String[] args) {

        //outer loop
        for (int i = 0; i<5; i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe");
        System.out.println("------------------------------");

        // inner loop
        for (int j =0; j<3; j++) { //int j =1 will give the same iterations = inner loop executes many times the outer loop

            for (int i = 0; i<5; i++){
                System.out.println("Hello World");
            }
            System.out.println("Hello Universe\n");
        }
    }
}

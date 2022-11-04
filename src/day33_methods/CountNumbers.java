package day33_methods;

public class CountNumbers {
    public static void counting(int n){

        for (int i = 0; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        counting(10);
        counting(5);
        counting(20);
    }
}

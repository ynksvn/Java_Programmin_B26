package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            for (int j = 1; j<=10; j++){
                System.out.print(i + " x " + j + " = " + (i*j) + " | ");
            } // end of the inner loop
            System.out.println();
        }

    }
}

/*
print the multiplication by the numbers from 1 to 10
We will see for all numbers 1-10
1*1 = 1
1*2 = 2

 */
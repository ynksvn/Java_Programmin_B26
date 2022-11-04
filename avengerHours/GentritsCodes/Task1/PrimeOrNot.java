package GentritsCodes.Task1;

public class PrimeOrNot {
    public static void main(String[] args) {

        int n = 5;
        isPrime(n);
        int m = 10;
        isPrime(m);

    }


    public static boolean isPrime(int number){

        boolean isPrime = number>=2;

        for (int i =2; i<number; i++){
            if(number%i ==0){
                isPrime =false;
            }

        }

        if (isPrime){
            System.out.println(number + " is Prime");
        }else{
            System.out.println(number + " is not Prime");
        }
        return true;

    }
}

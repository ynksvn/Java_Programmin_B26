package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 20;
        boolean isPrime = false;


        if (isPrime) {

            System.out.println("Eligible for 2 day shipping");

        } else {

            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is $3.99");

            }
        }
    }
}

